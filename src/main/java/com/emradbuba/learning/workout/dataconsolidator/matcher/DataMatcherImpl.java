package com.emradbuba.learning.workout.dataconsolidator.matcher;

import com.emradbuba.learning.workout.dataconsolidator.matcher.hashing.HashCalculator;
import com.emradbuba.learning.workout.dataconsolidator.matcher.result.MatchedItem;
import com.emradbuba.learning.workout.dataconsolidator.matcher.result.MatchingResult;
import lombok.AllArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;

@AllArgsConstructor
public class DataMatcherImpl<T> implements DataMatcher<T> {
    private final HashCalculator<T> hashCalculator;

    public MatchingResult<T> performMatching(List<T> listA, List<T> listB) {
        MatchingResult<T> result = new MatchingResult<>();
        Map<Integer, LinkedList<T>> frequencyMapA = convertToFrequencyMap(listA);
        Map<Integer, LinkedList<T>> frequencyMapB = convertToFrequencyMap(listB);
        handleElementsAppearingOnlyOnOneSide(frequencyMapA, frequencyMapB, result);
        for (Map.Entry<Integer, LinkedList<T>> entrySetA : frequencyMapA.entrySet()) {
            Integer hash = entrySetA.getKey();
            if (frequencyMapB.containsKey(hash)) {
                handleCaseOfExistingCounterparts(frequencyMapA.get(hash), frequencyMapB.get(hash), result);
            }
        }
        return result;
    }

    private void handleCaseOfExistingCounterparts(LinkedList<T> listA, LinkedList<T> listB, MatchingResult<T> result) {
        while (!listA.isEmpty() && !listB.isEmpty()) {
            T valueA = listA.poll();
            T valueB = listB.poll();
            result.addMatchedItems(Collections.singletonList(new MatchedItem<>(valueA, valueB)));
        }
        result.addUnmatchedA(listA);
        result.addUnmatchedB(listB);
    }

    private void handleElementsAppearingOnlyOnOneSide(Map<Integer, LinkedList<T>> mapA,
                                                      Map<Integer, LinkedList<T>> mapB,
                                                      MatchingResult<T> result) {
        Set<Integer> nonExistingCounterpartsForA = retrieveKeysNotExistingInSecondMap(mapA, mapB);
        nonExistingCounterpartsForA.forEach(
                key -> result.addUnmatchedA(mapA.get(key))
        );
        Set<Integer> nonExistingCounterpartsForB = retrieveKeysNotExistingInSecondMap(mapB, mapA);
        nonExistingCounterpartsForB.forEach(
                key -> result.addUnmatchedB(mapB.get(key))
        );
    }

    private Set<Integer> retrieveKeysNotExistingInSecondMap(Map<Integer, LinkedList<T>> mapA, Map<Integer,
            LinkedList<T>> mapB) {
        return mapA.keySet()
                .stream()
                .filter(key -> !mapB.containsKey(key))
                .collect(Collectors.toSet());
    }

    private Map<Integer, LinkedList<T>> convertToFrequencyMap(List<T> theList) {
        return theList.stream()
                .collect(Collectors.groupingBy(
                        hashCalculator::calculateHash, Collectors.toCollection(LinkedList<T>::new)
                ));
    }
}
package com.emradbuba.learning.workout.dataconsolidator.matcher.result;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Getter
public class MatchingResult<T> {
    private final List<T> unMatchedA = new ArrayList<>();
    private final List<T> unMatchedB = new ArrayList<>();
    private final List<MatchedItem<T>> matched = new ArrayList<>();

    public void addUnmatchedA(Collection<T> elements) {
        unMatchedA.addAll(elements);
    }

    public void addUnmatchedB(Collection<T> elements) {
        unMatchedB.addAll(elements);
    }

    public void addMatchedItems(Collection<MatchedItem<T>> matchedItems) {
        matched.addAll(matchedItems);
    }

    @Override
    public String toString() {
        return "MatchingResult{" +
                "unMatchedA=" + unMatchedA +
                ", unMatchedB=" + unMatchedB +
                ", getMatched=" + matched +
                '}';
    }
}
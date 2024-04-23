package com.emradbuba.learning.workout.dataconsolidator.matcher;

import com.emradbuba.learning.workout.dataconsolidator.matcher.result.MatchedItem;
import com.emradbuba.learning.workout.dataconsolidator.matcher.result.MatchingResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DataMatcherImplDoubleTest {
    private DataMatcherImpl<Double> dataMatcherImpl;

    @BeforeEach
    void setUp() {
        dataMatcherImpl = new DataMatcherImpl<>(Object::hashCode);
    }

    @Test
    void shouldCorrectlyDetectUnmatchedInBothListsWhenNoDuplicates() {
        List<Double> listA = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);
        List<Double> listB = List.of(0.0, 2.0, 4.0, 6.0, 8.0, 10.0);

        MatchingResult<Double> result = dataMatcherImpl.performMatching(listA, listB);

        assertNotNull(result);
        assertTrue(result.getUnMatchedA().containsAll(List.of(1.0, 3.0, 5.0)));
        assertTrue(result.getUnMatchedB().containsAll(List.of(0.0, 8.0, 10.0)));
        System.out.println(result);
    }

    @Test
    void shouldCorrectlyDetectUnmatchedInBothListsWhenNoDuplicatesAndOppositeValues() {
        List<Double> listA = List.of(1.0, 2.0, 3.0, 4.0, 5.0, -6.0);
        List<Double> listB = List.of(0.0, -2.0, 4.0, 6.0, 8.0, 10.0);

        MatchingResult<Double> result = dataMatcherImpl.performMatching(listA, listB);

        assertNotNull(result);
        assertTrue(result.getUnMatchedA().containsAll(List.of(1.0, 3.0, 5.0)));
        assertTrue(result.getUnMatchedB().containsAll(List.of(0.0, 8.0, 10.0)));
        System.out.println(result);
    }

    @Test
    void shouldCorrectlyDetectNoUnmatchedElementsWhenNoSuchInListA() {
        List<Double> listA = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);
        List<Double> listB = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0);

        MatchingResult<Double> result = dataMatcherImpl.performMatching(listA, listB);

        assertNotNull(result);
        assertTrue(result.getUnMatchedA().isEmpty());
        assertTrue(result.getUnMatchedB().contains(7.0));
        assertEquals(1, result.getUnMatchedB().size());
        System.out.println(result);
    }

    @Test
    void shouldCorrectlyDetectNoUnmatchedElementsWhenNoSuchInListB() {
        List<Double> listA = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0);
        List<Double> listB = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);

        MatchingResult<Double> result = dataMatcherImpl.performMatching(listA, listB);

        assertNotNull(result);
        assertTrue(result.getUnMatchedB().isEmpty());
        assertTrue(result.getUnMatchedA().contains(7.0));
        assertEquals(1, result.getUnMatchedA().size());
        System.out.println(result);
    }

    @Test
    void shouldCorrectlyDetectNoUnmatchedElementsWhenListContainsSameElements() {
        List<Double> listA = List.of(2.0, 1.0, 3.0, 6.0, 5.0, 4.0);
        List<Double> listB = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);

        MatchingResult<Double> result = dataMatcherImpl.performMatching(listA, listB);

        assertNotNull(result);
        assertTrue(result.getUnMatchedA().isEmpty());
        assertTrue(result.getUnMatchedB().isEmpty());
        System.out.println(result);
    }

    @Test
    void shouldCorrectlyDetectUnmatchedInBothListsWithDuplicates() {
        List<Double> listA = List.of(1.0, 1.0, 2.0, 2.0, 3.0, 3.0, 4.0, 4.0, 5.0, 5.0, 6.0, 6.0, 6.0);
        List<Double> listB = List.of(0.0, 0.0, 0.0, 2.0, 4.0, 6.0, 8.0, 10.0);

        MatchingResult<Double> result = dataMatcherImpl.performMatching(listA, listB);

        assertNotNull(result);
        assertTrue(result.getUnMatchedA().containsAll(List.of(1.0, 1.0, 2.0, 3.0, 3.0, 5.0, 5.0)));
        assertEquals(2, result.getUnMatchedA().stream().filter(item -> item.equals(1.0)).count());
        assertEquals(1, result.getUnMatchedA().stream().filter(item -> item.equals(2.0)).count());
        assertEquals(2, result.getUnMatchedA().stream().filter(item -> item.equals(3.0)).count());
        assertEquals(2, result.getUnMatchedA().stream().filter(item -> item.equals(5.0)).count());
        assertEquals(3, result.getUnMatchedB().stream().filter(item -> item.equals(0.0)).count());
        assertEquals(3, result.getUnMatchedB().stream().filter(item -> item.equals(0.0)).count());
        assertEquals(1, result.getUnMatchedB().stream().filter(item -> item.equals(8.0)).count());
        assertEquals(1, result.getUnMatchedB().stream().filter(item -> item.equals(10.0)).count());
        System.out.println(result);
    }

    @Test
    void shouldCorrectlyDetectUnmatchedInListAWhenSameElementButDifferentSize() {
        List<Double> listA = List.of(1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0);
        List<Double> listB = List.of(1.0, 1.0, 1.0);

        MatchingResult<Double> result = dataMatcherImpl.performMatching(listA, listB);

        assertNotNull(result);
        assertArrayEquals(new Double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, result.getUnMatchedA().toArray());
        assertEquals(1, result.getUnMatchedA().stream().distinct().count());
        assertTrue(result.getUnMatchedB().isEmpty());
        System.out.println(result);
    }

    @Test
    void shouldCorrectlyDetectMatchingPairs() {
        List<Double> listA = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> listB = List.of(1.0, 2.0, 3.0, 4.0, 5.0);

        MatchingResult<Double> result = dataMatcherImpl.performMatching(listA, listB);

        assertNotNull(result);
        assertEquals(5, result.getMatched().size());
        for (MatchedItem<Double> doubleMatchedItem : result.getMatched()) {
            assertEquals(doubleMatchedItem.item1(), doubleMatchedItem.item2());
        }
        System.out.println(result);
    }

    @Test
    void shouldCorrectlyDetectMatchingPairsWhenOnlyOne() {
        List<Double> listA = List.of(5.0, 6.0, 7.0, 8.0, 9.0);
        List<Double> listB = List.of(1.0, 2.0, 10.0, 4.0, 5.0);

        MatchingResult<Double> result = dataMatcherImpl.performMatching(listA, listB);

        assertNotNull(result);
        assertEquals(1, result.getMatched().size());
        assertEquals(5.0, result.getMatched().get(0).item1());
        assertEquals(5.0, result.getMatched().get(0).item2());
        System.out.println(result);
    }

    @Test
    void shouldCorrectlyDetectMatchingPairsWhenListsOfEqualElements() {
        List<Double> listA = List.of(1.0, 1.0, 1.0, 1.0, 1.0, 1.0);
        List<Double> listB = List.of(1.0, 1.0, 1.0);

        MatchingResult<Double> result = dataMatcherImpl.performMatching(listA, listB);

        assertNotNull(result);
        assertEquals(3, result.getMatched().size());
        for (MatchedItem<Double> doubleMatchedItem : result.getMatched()) {
            assertEquals(1.0, doubleMatchedItem.item1());
            assertEquals(1.0, doubleMatchedItem.item2());
        }
        System.out.println(result);
    }

    @Test
    void shouldCorrectlyDetectNoMatchingPairs() {
        List<Double> listA = List.of(1.0, 2.0, 3.0, 4.0);
        List<Double> listB = List.of(5.0, 6.0, 7.0);

        MatchingResult<Double> result = dataMatcherImpl.performMatching(listA, listB);

        assertNotNull(result);
        assertTrue(result.getMatched().isEmpty());
        System.out.println(result);
    }
}
package com.gitlab.emradbuba.learning.java_examples.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveSumTest {
    @Test
    void shouldReturnCorrectValueForEmptyArray() {
        assertEquals(0, RecursiveSum.calculateSum(new int[]{}));
    }

    @Test
    void shouldReturnCorrectValueForSingleElement() {
        assertEquals(1, RecursiveSum.calculateSum(new int[]{1}));
        assertEquals(14, RecursiveSum.calculateSum(new int[]{14}));
        assertEquals(0, RecursiveSum.calculateSum(new int[]{0}));
    }

    @Test
    void shouldReturnCorrectValueForTwoElements() {
        assertEquals(3, RecursiveSum.calculateSum(new int[]{1, 2}));
        assertEquals(17, RecursiveSum.calculateSum(new int[]{14, 3}));
        assertEquals(10, RecursiveSum.calculateSum(new int[]{5, 5}));
    }

    @Test
    void shouldReturnCorrectValueForEvenNumberOfElements() {
        assertEquals(10, RecursiveSum.calculateSum(new int[]{1, 2, 3 ,4}));
        assertEquals(10, RecursiveSum.calculateSum(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
        assertEquals(1956, RecursiveSum.calculateSum(new int[]{900, 900, 150, 1, 2, 3}));
    }

    @Test
    void shouldReturnCorrectValueForOddNumberOfElements() {
        assertEquals(10, RecursiveSum.calculateSum(new int[]{1, 2, 7}));
        assertEquals(10, RecursiveSum.calculateSum(new int[]{1, 1, 2, 1, 1, 1, 1, 1, 1}));
        assertEquals(1959, RecursiveSum.calculateSum(new int[]{3, 900, 900, 150, 1, 2, 3}));
    }
}
package com.emradbuba.learning.workout.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

class SortingAlgorithmTest {

    @TestAllImplementations
    void shouldSortChatGptExample(String solutionName, SortingAlgorithm solution) {

        Assertions.assertArrayEquals(new int[]{2, 3, 4, 5}, solution.sortArray(new int[]{5, 3, 4, 2}));

    }

    @TestAllImplementations
    void shouldSortUnSortedArrayWithEvenUniqueElements(String solutionName, SortingAlgorithm solution) {

        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, solution.sortArray(new int[]{6, 2, 3, 5, 1, 4}));

    }

    @TestAllImplementations
    void shouldSortUnSortedArrayWithOddUniqueElements(String solutionName, SortingAlgorithm solution) {

        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, solution.sortArray(new int[]{5, 1, 4, 2, 6, 7, 9, 8, 3}));

    }

    @TestAllImplementations
    void shouldSortUnSortedArrayWithEvenNotUniqueElements(String solutionName, SortingAlgorithm solution) {

        Assertions.assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9}, solution.sortArray(new int[]{5, 5, 1, 1, 4, 4, 2, 2, 6, 6, 7, 7, 9, 9, 8, 8, 3, 3}));

    }

    @TestAllImplementations
    void shouldSortUnSortedArrayWithOddNotUniqueElements(String solutionName, SortingAlgorithm solution) {

        Assertions.assertArrayEquals(new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3}, solution.sortArray(new int[]{2, 1, 3, 3, 2, 1, 2, 1, 3}));

    }

    @TestAllImplementations
    void shouldSortSortedArrayWithEvenUniqueElements(String solutionName, SortingAlgorithm solution) {

        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, solution.sortArray(new int[]{1, 2, 3, 4, 5, 6}));

    }

    @TestAllImplementations
    void shouldSortSortedArrayWithOddUniqueElements(String solutionName, SortingAlgorithm solution) {

        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, solution.sortArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));

    }

    @TestAllImplementations
    void shouldSortSortedArrayWithEvenNotUniqueElements(String solutionName, SortingAlgorithm solution) {

        Assertions.assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6}, solution.sortArray(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6}));

    }

    @TestAllImplementations
    void shouldSortSortedArrayWithOddNotUniqueElements(String solutionName, SortingAlgorithm solution) {

        Assertions.assertArrayEquals(new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3}, solution.sortArray(new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3}));

    }

    @TestAllImplementations
    void shouldSortReverseSortedArrays(String solutionName, SortingAlgorithm solution) {
        Assertions.assertArrayEquals(new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3}, solution.sortArray(new int[]{3, 3, 3, 2, 2, 2, 1, 1, 1}));
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, solution.sortArray(new int[]{8, 7, 6, 5, 4, 3, 2, 1}));
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, solution.sortArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}));
    }

    @TestAllImplementations
    void shouldSortASingleElementArray(String solutionName, SortingAlgorithm solution) {

        Assertions.assertArrayEquals(new int[]{1}, solution.sortArray(new int[]{1}));

    }

    @TestAllImplementations
    void shouldSortTwoElementsArray(String solutionName, SortingAlgorithm solution) {

        Assertions.assertArrayEquals(new int[]{1, 2}, solution.sortArray(new int[]{1, 2}));
        Assertions.assertArrayEquals(new int[]{1, 2}, solution.sortArray(new int[]{2, 1}));

    }

    @TestAllImplementations
    void shouldSortAnEmptyArray(String solutionName, SortingAlgorithm solution) {

        Assertions.assertArrayEquals(new int[]{}, solution.sortArray(new int[]{}));

    }

    @TestAllImplementations
    void shouldReturnNullWhenNullInput(String solutionName, SortingAlgorithm solution) {

        Assertions.assertNull(solution.sortArray(null));

    }

    static Stream<Arguments> allImplementations() {
        return Stream.of(
                Arguments.of("Quick Sort Algorithm", new QuickSortingAlgorithm()),
                Arguments.of("Insert Sort Algorithm", new InsertSortingAlgorithm())
                // TODO: MergeSort
        );
    }
}
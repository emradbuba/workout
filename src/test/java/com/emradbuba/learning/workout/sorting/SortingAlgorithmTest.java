package com.emradbuba.learning.workout.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

class SortingAlgorithmTest {

    @TestAllImplementations
    void should(String solutionName, SortingAlgorithm solution) {

        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, solution.sortArray(new int[]{6, 5, 4, 3, 2, 1}));

    }

    @TestAllImplementations
    void shouldX(String solutionName, SortingAlgorithm solution) {

        Assertions.assertArrayEquals(new int[]{3, 3, 2, 2, 1, 1, 2, 3, 1}, solution.sortArray(new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3}));

    }

    @TestAllImplementations
    void should2(String solutionName, SortingAlgorithm solution) {

        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, solution.sortArray(new int[]{1, 2, 3, 4, 5, 6}));

    }

    @TestAllImplementations
    void should3(String solutionName, SortingAlgorithm solution) {

        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, solution.sortArray(new int[]{6, 1, 4, 5, 2, 3}));

    }

    @TestAllImplementations
    void should4(String solutionName, SortingAlgorithm solution) {

        Assertions.assertArrayEquals(new int[]{2, 1}, solution.sortArray(new int[]{1, 2}));

    }

    @TestAllImplementations
    void should4a(String solutionName, SortingAlgorithm solution) {

        Assertions.assertArrayEquals(new int[]{1, 2}, solution.sortArray(new int[]{1, 2}));

    }

    @TestAllImplementations
    void should4b(String solutionName, SortingAlgorithm solution) {

        Assertions.assertArrayEquals(new int[]{1, 1, 1, 1, 1}, solution.sortArray(new int[]{1, 1, 1, 1, 1}));

    }


    @TestAllImplementations
    void should5(String solutionName, SortingAlgorithm solution) {

        Assertions.assertArrayEquals(new int[]{1}, solution.sortArray(new int[]{1}));

    }

    @TestAllImplementations
    void should6(String solutionName, SortingAlgorithm solution) {

        Assertions.assertArrayEquals(new int[]{}, solution.sortArray(new int[]{}));

    }


    static Stream<Arguments> allImplementations() {
        return Stream.of(
                Arguments.of("QuickSort", new QuickSortingAlgorithm())
        );
    }

}
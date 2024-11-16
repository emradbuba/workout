package com.emradbuba.learning.workout.leetcode.binarysearch_704;

import com.emradbuba.learning.workout.leetcode.TestAllImplementations;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchSolutionTest {

    @TestAllImplementations
    void shouldBinarySearchFindElement(String solutionName, BinarySearchSolution solution) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        int result = solution.search(array, 3);

        assertEquals(2, result);
    }

    @TestAllImplementations
    void shouldBinarySearchFindFirstElement(String solutionName, BinarySearchSolution solution) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        int result = solution.search(array, 1);

        assertEquals(0, result);
    }

    @TestAllImplementations
    void shouldBinarySearchFindLastElement(String solutionName, BinarySearchSolution solution) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        int result = solution.search(array, 9);

        assertEquals(8, result);
    }

    @TestAllImplementations
    void shouldBinarySearchFindFirstElementWhenLengthTwo(String solutionName, BinarySearchSolution solution) {

        int[] array = new int[]{1, 2};

        int result = solution.search(array, 1);

        assertEquals(0, result);
    }

    @TestAllImplementations
    void shouldBinarySearchFindLastElementWhenLengthTwo(String solutionName, BinarySearchSolution solution) {

        int[] array = new int[]{1, 2};

        int result = solution.search(array, 2);

        assertEquals(1, result);
    }

    @TestAllImplementations
    void shouldBinarySearchFindElementWhenLengthOne(String solutionName, BinarySearchSolution solution) {

        int[] array = new int[]{2};

        int result = solution.search(array, 2);

        assertEquals(0, result);
    }

    @TestAllImplementations
    void shouldBinarySearchNotFindElementWhenNotExistsAndMiddle(String solutionName, BinarySearchSolution solution) {

        int[] array = new int[]{1, 2, 3, 4, 6, 7, 8, 9};

        int result = solution.search(array, 5);

        assertEquals(-1, result);
    }

    @TestAllImplementations
    void shouldBinarySearchNotFindElementWhenNotExistsAndBeforeRange(String solutionName, BinarySearchSolution solution) {

        int[] array = new int[]{1, 2, 3, 4, 6, 7, 8, 9};

        int result = solution.search(array, 0);

        assertEquals(-1, result);
    }

    @TestAllImplementations
    void shouldBinarySearchNotFindElementWhenNotExistsAndAfterRange(String solutionName, BinarySearchSolution solution) {

        int[] array = new int[]{1, 2, 3, 4, 6, 7, 8, 9};

        int result = solution.search(array, 12);

        assertEquals(-1, result);
    }

    @TestAllImplementations
    void shouldBinarySearchNotFindElementWhenNotExistsAndLenghtTwo(String solutionName, BinarySearchSolution solution) {

        int[] array = new int[]{1, 5};

        int result = solution.search(array, 3);

        assertEquals(-1, result);
    }

    @TestAllImplementations
    void shouldBinarySearchNotFindElementWhenNotExistsAndLenghtTwoAndAfterRange(String solutionName, BinarySearchSolution solution) {

        int[] array = new int[]{1, 5};

        int result = solution.search(array, 8);

        assertEquals(-1, result);
    }

    @TestAllImplementations
    void shouldBinarySearchNotFindElementWhenNotExistsAndLenghtTwoAndBeforeRange(String solutionName, BinarySearchSolution solution) {

        int[] array = new int[]{2, 5};

        int result = solution.search(array, 1);

        assertEquals(-1, result);
    }

    @TestAllImplementations
    void shouldBinarySearchNotFindElementWhenNotExistsAndLenghtOne(String solutionName, BinarySearchSolution solution) {

        int[] array = new int[]{10};

        assertEquals(-1, solution.search(array, 5));
        assertEquals(-1, solution.search(array, 15));
    }

    @TestAllImplementations
    void shouldBinarySearchNotFindElementWhenEmptyArray(String solutionName, BinarySearchSolution solution) {

        int[] array = new int[]{};

        int result = solution.search(array, 2);

        assertEquals(-1, result);
    }

    @TestAllImplementations
    void shouldBinarySearchNotFindElementWhenNullArray(String solutionName, BinarySearchSolution solution) {

        int result = solution.search(null, 2);

        assertEquals(-1, result);
    }

    static Stream<Arguments> allImplementations() {
        return Stream.of(
                Arguments.of("Recursive solution", new BinarySearchRecursiveSolution())git
                //Arguments.of("Recursive loop-based solution", new BinarySearchLoopRecursiveSolution())
        );
    }

}
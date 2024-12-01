package com.emradbuba.learning.workout.leetcode.minsizesubarraysum_209;

import com.emradbuba.learning.workout.leetcode.TestAllImplementations;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumSizeSubarraySumSolutionTest {


    @TestAllImplementations
    void should(String solutionName, MinimumSizeSubarraySumSolution solution) {

        assertEquals(5, solution.minSubArrayLen(5, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
        assertEquals(3, solution.minSubArrayLen(4, new int[]{1, 1, 2, 1, 1, 1, 1, 1}));
        assertEquals(3, solution.minSubArrayLen(4, new int[]{1, 1, 1, 1, 1, 1, 2, 1}));
        assertEquals(2, solution.minSubArrayLen(4, new int[]{1, 2, 3, 1, 1, 1, 1, 1}));
        assertEquals(1, solution.minSubArrayLen(5, new int[]{1, 2, 3, 1, 1, 1, 1, 5}));
        assertEquals(2, solution.minSubArrayLen(4, new int[]{1, 1, 1, 1, 1, 1, 2, 2}));
        assertEquals(1, solution.minSubArrayLen(4, new int[]{4, 1, 1, 1, 1, 1, 2, 2}));
        assertEquals(1, solution.minSubArrayLen(4, new int[]{1, 2, 1, 3, 3, 7}));
    }

    @TestAllImplementations
    void should2(String solutionName, MinimumSizeSubarraySumSolution solution) {

        assertEquals(0, solution.minSubArrayLen(7, new int[]{1, 1, 1, 1, 1, 1}));
        assertEquals(0, solution.minSubArrayLen(7, new int[]{0, 2, 1, 1, 1, 1}));
    }

    @TestAllImplementations
    void should3(String solutionName, MinimumSizeSubarraySumSolution solution) {

        assertEquals(1, solution.minSubArrayLen(8, new int[]{8}));
        assertEquals(0, solution.minSubArrayLen(8, new int[]{1}));
    }

    @TestAllImplementations
    void should4(String solutionName, MinimumSizeSubarraySumSolution solution) {

        assertEquals(1, solution.minSubArrayLen(8, new int[]{1, 8}));
        assertEquals(1, solution.minSubArrayLen(8, new int[]{8, 1}));
    }

    @TestAllImplementations
    void should5(String solutionName, MinimumSizeSubarraySumSolution solution) {

        assertEquals(1, solution.minSubArrayLen(8, new int[]{8, 4, 4, 4}));
    }

    @TestAllImplementations
    void should6(String solutionName, MinimumSizeSubarraySumSolution solution) {

        assertEquals(1, solution.minSubArrayLen(8, new int[]{4, 4, 4, 12, 4}));
    }

    static Stream<Arguments> allImplementations() {
        return Stream.of(
                Arguments.of("First solution", new MinimumSizeSubarraySumWorkoutSolution())
        );
    }
}
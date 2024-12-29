package com.emradbuba.learning.workout.leetcode.minsizesubarraysum_209b;

import com.emradbuba.learning.workout.leetcode.TestAllImplementations;
import org.junit.jupiter.params.provider.Arguments;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSizeSubarraySumBWorkoutSolutionTest {

    @TestAllImplementations
    void should(String solutionName, MinimumSizeSubarraySumBSolution solution) {

        List<MinimumSizeSubarraySumBSolution.SolutionResult> solutionResults = solution.minSubArrayLen(4, new int[]{1, 1, 1, 1, 1});

        assertNotNull(solutionResults);
        assertEquals(2, solutionResults.size());
        assertTrue(solutionResults.contains(new MinimumSizeSubarraySumBSolution.SolutionResult(0, 3)));
        assertTrue(solutionResults.contains(new MinimumSizeSubarraySumBSolution.SolutionResult(1, 4)));
    }

    @TestAllImplementations
    void should2(String solutionName, MinimumSizeSubarraySumBSolution solution) {

        List<MinimumSizeSubarraySumBSolution.SolutionResult> solutionResults = solution.minSubArrayLen(5, new int[]{1, 1, 1, 1, 1});

        assertNotNull(solutionResults);
        assertEquals(1, solutionResults.size());
        assertTrue(solutionResults.contains(new MinimumSizeSubarraySumBSolution.SolutionResult(0, 4)));
    }

    @TestAllImplementations
    void should3(String solutionName, MinimumSizeSubarraySumBSolution solution) {

        List<MinimumSizeSubarraySumBSolution.SolutionResult> solutionResults = solution.minSubArrayLen(6, new int[]{1, 1, 1, 1, 1});

        assertTrue(solutionResults.isEmpty());
    }

    @TestAllImplementations
    void should4(String solutionName, MinimumSizeSubarraySumBSolution solution) {

        List<MinimumSizeSubarraySumBSolution.SolutionResult> solutionResults = solution.minSubArrayLen(4, new int[]{1, 1, 4, 1, 1});

        assertNotNull(solutionResults);
        assertEquals(1, solutionResults.size());
        assertTrue(solutionResults.contains(new MinimumSizeSubarraySumBSolution.SolutionResult(2, 2)));
    }

    @TestAllImplementations
    void should4a(String solutionName, MinimumSizeSubarraySumBSolution solution) {

        List<MinimumSizeSubarraySumBSolution.SolutionResult> solutionResults = solution.minSubArrayLen(4, new int[]{1, 1, 2, 2, 1, 1});

        assertNotNull(solutionResults);
        assertEquals(1, solutionResults.size());
        assertTrue(solutionResults.contains(new MinimumSizeSubarraySumBSolution.SolutionResult(2, 3)));
    }

    @TestAllImplementations
    void should5(String solutionName, MinimumSizeSubarraySumBSolution solution) {

        List<MinimumSizeSubarraySumBSolution.SolutionResult> solutionResults = solution.minSubArrayLen(4, new int[]{1, 2, 2, 1, 2, 2, 1, 2, 2});

        assertNotNull(solutionResults);
        assertEquals(3, solutionResults.size());
        assertTrue(solutionResults.contains(new MinimumSizeSubarraySumBSolution.SolutionResult(1, 2)));
        assertTrue(solutionResults.contains(new MinimumSizeSubarraySumBSolution.SolutionResult(4, 5)));
        assertTrue(solutionResults.contains(new MinimumSizeSubarraySumBSolution.SolutionResult(7, 8)));
    }

    @TestAllImplementations
    void should6(String solutionName, MinimumSizeSubarraySumBSolution solution) {

        List<MinimumSizeSubarraySumBSolution.SolutionResult> solutionResults = solution.minSubArrayLen(4, new int[]{1, 2, 2, 1, 2, 2, 1, 4, 2});

        assertNotNull(solutionResults);
        assertEquals(1, solutionResults.size());
        assertTrue(solutionResults.contains(new MinimumSizeSubarraySumBSolution.SolutionResult(7, 7)));
    }

    @TestAllImplementations
    void should7(String solutionName, MinimumSizeSubarraySumBSolution solution) {

        List<MinimumSizeSubarraySumBSolution.SolutionResult> solutionResults = solution.minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});

        assertNotNull(solutionResults);
        assertEquals(3, solutionResults.size());
        assertTrue(solutionResults.contains(new MinimumSizeSubarraySumBSolution.SolutionResult(0, 10)));
        assertTrue(solutionResults.contains(new MinimumSizeSubarraySumBSolution.SolutionResult(1, 11)));
        assertTrue(solutionResults.contains(new MinimumSizeSubarraySumBSolution.SolutionResult(2, 12)));
    }

    @TestAllImplementations
    void should8(String solutionName, MinimumSizeSubarraySumBSolution solution) {

        List<MinimumSizeSubarraySumBSolution.SolutionResult> solutionResults = solution.minSubArrayLen(1, new int[]{1, 1, 1, 1});

        assertNotNull(solutionResults);
        assertEquals(4, solutionResults.size());
        assertTrue(solutionResults.contains(new MinimumSizeSubarraySumBSolution.SolutionResult(0, 0)));
        assertTrue(solutionResults.contains(new MinimumSizeSubarraySumBSolution.SolutionResult(1, 1)));
        assertTrue(solutionResults.contains(new MinimumSizeSubarraySumBSolution.SolutionResult(2, 2)));
        assertTrue(solutionResults.contains(new MinimumSizeSubarraySumBSolution.SolutionResult(3, 3)));
    }


    static Stream<Arguments> allImplementations() {
        return Stream.of(
                Arguments.of("First solution", new MinimumSizeSubarraySumBWorkoutSolution())
        );
    }
}
package com.emradbuba.learning.workout.leetcode.twosum;

import com.emradbuba.learning.workout.leetcode.TestAllImplementations;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class TwoSumSolutionTest {

    @TestAllImplementations
    void shouldReturnExpectedIndexesForHappyCase(String testName, TwoSumSolution solution) {
        int[] numbers = new int[]{1, 3, 6, 5};
        int target = 6;

        int[] result = solution.twoSum(numbers, target);

        assertThat(result).isNotNull();
        assertThat(result).hasSize(2);
        assertThat(result).contains(0, 3);
    }

    @TestAllImplementations
    void shouldReturnExpectedIndexesWhenTargetFoundWithPlusAndMinus(String testName, TwoSumSolution solution) {
        int[] numbers = new int[]{1, -3, 3, 6, 5};
        int target = 2;

        int[] result = solution.twoSum(numbers, target);

        assertThat(result).isNotNull();
        assertThat(result).hasSize(2);
        assertThat(result).contains(1, 4);
    }

    @TestAllImplementations
    void shouldReturnEmptyArrayWhenNotEnoughElements(String testName, TwoSumSolution solution) {
        assertThat(solution.twoSum(new int[]{1}, 1)).isNotNull();
        assertThat(solution.twoSum(new int[]{1}, 1)).isEmpty();

        assertThat(solution.twoSum(new int[]{}, 0)).isNotNull();
        assertThat(solution.twoSum(new int[]{}, 0)).isEmpty();
    }

    static Stream<Arguments> allImplementations() {
        return Stream.of(
                Arguments.of("Basic solution", new TwoSumBasicSolution()),
                Arguments.of( "HashMap approach solution", new TwoSumHashMapSolution()),
                Arguments.of( "Pointers approach solution", new TwoSumPointersSolution())
        );
    }
}
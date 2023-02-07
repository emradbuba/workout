package com.gitlab.emradbuba.learning.java_examples.codewars.max_counter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxCounterSolutionTest {
    private MaxCounterSolution maxCounterSolution;

    @BeforeEach
    void setUp() {
        maxCounterSolution = new MaxCounterSolution();
    }

    @Test
    void shouldIncreaseAllCounters() {
        // given
        int N = 3;
        int A[] = new int[]{1, 2, 3};

        // when
        int[] result = maxCounterSolution.solution(N, A);

        // then
        assertArrayEquals(new int[]{1, 1, 1}, result);
    }

    @Test
    void shouldIncreaseOneCounterThreeTimes() {
        // given
        int N = 3;
        int A[] = new int[]{2, 2, 2};

        // when
        int[] result = maxCounterSolution.solution(N, A);

        // then
        assertArrayEquals(new int[]{0, 3, 0}, result);
    }

    @Test
    void shouldDoNothingWhenIncorrectInput() { // ?
        // given
        int N = 3;
        int A[] = new int[]{-2, 0, -1};

        // when
        int[] result = maxCounterSolution.solution(N, A);

        // then
        assertArrayEquals(new int[]{0, 0, 0}, result);
    }

    @Test
    void shouldIncreaseMultipleTimes() {
        // given
        int N = 3;
        int A[] = new int[]{2, 1, 1, 1, 1, 3, 3, 2, 1, 2};

        // when
        int[] result = maxCounterSolution.solution(N, A);

        // then
        assertArrayEquals(new int[]{5, 3, 2}, result);
    }

    @Test
    void shouldSetMaCounterToAllAtTheEnd() {
        // given
        int N = 3;
        int A[] = new int[]{2, 1, 1, 1, 1, 3, 3, 2, 1, 2, 8};

        // when
        int[] result = maxCounterSolution.solution(N, A);

        // then
        assertArrayEquals(new int[]{5, 5, 5}, result);
    }

    @Test
    void shouldSetMaxCounterTwoTimesInARowAtTheEnd() {
        // given
        int N = 3;
        int A[] = new int[]{2, 1, 1, 1, 1, 3, 3, 2, 1, 2, 8, 9};

        // when
        int[] result = maxCounterSolution.solution(N, A);

        // then
        assertArrayEquals(new int[]{5, 5, 5}, result);
    }

    @Test
    void shouldSetMaxCounterAndContinueIncreasing() {
        // given
        int N = 3;
        int A[] = new int[]{2, 1, 1, 1, 1, 3, 3, 2, 1, 2, 8, 1, 1, 3, 3};

        // when
        int[] result = maxCounterSolution.solution(N, A);

        // then
        assertArrayEquals(new int[]{7, 5, 7}, result);
    }

    @Test
    void shouldSetMaxCounterThenContinueIncreasingAndThenSetMaxCounter() {
        // given
        int N = 3;
        int A[] = new int[]{2, 1, 1, 1, 1, 3, 3, 2, 1, 2, 8, 1, 1, 3, 3, 9};

        // when
        int[] result = maxCounterSolution.solution(N, A);

        // then
        assertArrayEquals(new int[]{7, 7, 7}, result);
    }
}
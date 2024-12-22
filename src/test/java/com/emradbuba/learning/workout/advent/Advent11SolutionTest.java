package com.emradbuba.learning.workout.advent;

import com.emradbuba.learning.workout.advent.model.Stone;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Advent11SolutionTest {

    private final Advent11Solution advent11Solution = new FirstAdvent11Solution();

    @Test
    void shouldSolutionReturnCorrectResultComplexInputAnd25Blinks() {
        int numberOfBlinks = 25;
        List<Stone> stones = StonesUtils.stringToStones("337 42493 1891760 351136 2 6932 73 0");

        int result = advent11Solution.solve(stones, numberOfBlinks);

        assertEquals(233875, result);
    }

    @Test
    void shouldSolutionReturnCorrectResultComplexInputAnd10Blinks() {
        int numberOfBlinks = 10;
        List<Stone> stones = StonesUtils.stringToStones("337 42493 1891760 351136 2 6932 73 0");

        int result = advent11Solution.solve(stones, numberOfBlinks);

        assertEquals(449, result);
    }

    @Test
    void shouldSolutionReturnCorrectResultComplexInputAnd1Blink() {
        int numberOfBlinks = 1;
        List<Stone> stones = StonesUtils.stringToStones("337 42493 1891760 351136 2 6932 73 0");

        int result = advent11Solution.solve(stones, numberOfBlinks);

        assertEquals(11, result);
    }

    @Test
    void shouldSolutionReturnCorrectResultSingleInputAnd10Blinks() {
        int numberOfBlinks = 10;
        List<Stone> stones = StonesUtils.stringToStones("2023");

        int result = advent11Solution.solve(stones, numberOfBlinks);

        assertEquals(80, result);
    }

    @Test
    void shouldSolutionReturnCorrectResultForOneAndSingleBlink() {
        int numberOfBlinks = 1;
        List<Stone> stones = StonesUtils.stringToStones("1");

        int result = advent11Solution.solve(stones, numberOfBlinks);

        assertEquals(1, result);
    }

    @Test
    void shouldSolutionReturnCorrectFor2024AndSingleBlink() {
        int numberOfBlinks = 1;
        List<Stone> stones = StonesUtils.stringToStones("2024");

        int result = advent11Solution.solve(stones, numberOfBlinks);

        assertEquals(2, result);
    }

    @Test
    void shouldSolutionReturnCorrectZeroAndSingleBlink() {
        int numberOfBlinks = 0;
        List<Stone> stones = StonesUtils.stringToStones("0");

        int result = advent11Solution.solve(stones, numberOfBlinks);

        assertEquals(1, result);
    }
}
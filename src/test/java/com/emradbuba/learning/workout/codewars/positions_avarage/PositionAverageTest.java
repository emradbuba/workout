package com.emradbuba.learning.workout.codewars.positions_avarage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PositionAverageTest {

    @Test
    public void posAverageFromCodewars() {
        assertFuzzy("466960, 069060, 494940, 060069, 060090, 640009, 496464, 606900, 004000, 944096", 26.666666667);
        assertFuzzy("444996, 699990, 666690, 096904, 600644, 640646, 606469, 409694, 666094, 606490", 29.2592592593);
        assertFuzzy("4444444, 4444444, 4444444, 4444444, 4444444, 4444444, 4444444, 4444444", 100.0);
        assertFuzzy("0, 0, 0, 0, 0, 0, 0, 0", 100);
    }

    @Test
    public void posAverageMyTests() {
        assertFuzzy("1111111, 2222222, 3333333, 4444444, 5555555, 6666666, 7777777, 8888888", 0.0);
        assertFuzzy("2345678, 2222222, 3333333, 4444444, 5555555, 6666666, 7777777, 8888888", 3.571428571);
    }

    @Test
    public void posAverageNoSubstrings() {
        assertFuzzy("", 0.0);
        assertFuzzy("1111111", 0.0);
    }

    @Test
    public void posAverageEqualSubsets() {
        assertFuzzy("111, 222, 111", 33.333333333);
    }


    @Test
    public void getNumberOfEquals() {
        assertEquals(0, PositionAverage.getNumberOfEquals("111", "222"));
        assertEquals(1, PositionAverage.getNumberOfEquals("111", "221"));
        assertEquals(3, PositionAverage.getNumberOfEquals("111", "111"));
        assertEquals(5, PositionAverage.getNumberOfEquals("111111111111", "431215412110"));
        assertEquals(0, PositionAverage.getNumberOfEquals("1234567890", "0987654321"));
    }

    private static void assertFuzzy(String s, double exp){
        System.out.println("Testing " + s);
        boolean inrange;
        double merr = 1e-9;
        double actual = PositionAverage.posAverage(s);
        inrange = Math.abs(actual - exp) <= merr;
        if (inrange == false) {
            System.out.println("Expected mean must be near " + exp +", got " + actual);
        }
        assertTrue(inrange);
    }


}
package com.emradbuba.learning.workout.advent;

import static com.emradbuba.learning.workout.advent.StonesUtils.stringToStones;

public class Advent24_21 {

    private static final int NUMBER_OF_BLINKS = 25;
    private static final String INPUT_STONES_STRING = "337 42493 1891760 351136 2 6932 73 0";
    private static final Advent11Solution advent11Solution = new FirstAdvent11Solution();


    public static void main(String[] args) {

        int result = advent11Solution.solve(stringToStones(INPUT_STONES_STRING), NUMBER_OF_BLINKS);

        System.out.println("Final number of stones after all blinks is... : " + result);
    }
}

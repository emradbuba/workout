package com.emradbuba.learning.workout.advent;

import com.emradbuba.learning.workout.advent.model.Stone;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Stream;

public class Advent24_21 {

    private static final int NUMBER_OF_BLINKS = 10;
    //private static final String INPUT_STONES_STRING = "337 42493 1891760 351136 2 6932 73 0";
    private static final String INPUT_STONES_STRING = "28676032";

    public static void main(String[] args) {
        int result = Solution.solve(stringToStones(INPUT_STONES_STRING), NUMBER_OF_BLINKS);
        System.out.println("Final number of stones after all blinks is... : " + result);
    }

    private static List<Stone> stringToStones(String stonesAsString) {
        String[] chunks = stonesAsString.split(" ");
        return Stream.of(chunks)
                .map(BigInteger::new)
                .map(Stone::new)
                .toList();
    }
}

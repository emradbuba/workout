package com.emradbuba.learning.workout.advent;

import com.emradbuba.learning.workout.advent.model.Stone;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Stream;

public class StonesUtils {
    public static List<Stone> stringToStones(String stonesAsString) {
        String[] chunks = stonesAsString.split(" ");
        return Stream.of(chunks)
                .map(BigInteger::new)
                .map(Stone::new)
                .toList();
    }

}

package com.emradbuba.learning.workout.advent.division.strategy.impl;

import com.emradbuba.learning.workout.advent.model.Stone;
import com.emradbuba.learning.workout.advent.division.strategy.DivisionStrategy;

import java.math.BigInteger;
import java.util.List;

public class EvenDigitsDivisionStrategy implements DivisionStrategy {

    @Override
    public boolean isApplicable(Stone stone) {
        return stone.value().toString().length() % 2 == 0;
    }

    @Override
    public List<Stone> divideStone(Stone stone) {
        String valueAsString = stone.value().toString();
        int secondPartBeginIdx = valueAsString.length() / 2;
        return List.of(
                new Stone(new BigInteger(valueAsString.substring(0, secondPartBeginIdx))),
                new Stone(new BigInteger(valueAsString.substring(secondPartBeginIdx)))
        );
    }
}

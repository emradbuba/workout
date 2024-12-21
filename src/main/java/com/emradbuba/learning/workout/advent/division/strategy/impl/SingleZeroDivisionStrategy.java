package com.emradbuba.learning.workout.advent.division.strategy.impl;

import com.emradbuba.learning.workout.advent.model.Stone;
import com.emradbuba.learning.workout.advent.division.strategy.DivisionStrategy;

import java.math.BigInteger;
import java.util.List;

public class SingleZeroDivisionStrategy implements DivisionStrategy {

    @Override
    public boolean isApplicable(Stone stone) {
        return BigInteger.ZERO.equals(stone.value());
    }

    @Override
    public List<Stone> divideStone(Stone stone) {
        return List.of(new Stone(BigInteger.ONE));
    }
}

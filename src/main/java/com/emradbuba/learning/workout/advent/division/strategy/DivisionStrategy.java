package com.emradbuba.learning.workout.advent.division.strategy;

import com.emradbuba.learning.workout.advent.model.Stone;

import java.util.List;

public interface DivisionStrategy {

    boolean isApplicable(Stone stone);

    List<Stone> divideStone(Stone stone);
}

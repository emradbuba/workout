package com.emradbuba.learning.workout.advent.division.blinker;

import com.emradbuba.learning.workout.advent.model.Stone;
import com.emradbuba.learning.workout.advent.division.strategy.impl.DefaultDivisionStrategy;
import com.emradbuba.learning.workout.advent.division.strategy.impl.EvenDigitsDivisionStrategy;
import com.emradbuba.learning.workout.advent.division.strategy.impl.SingleZeroDivisionStrategy;

import java.util.ArrayList;
import java.util.List;

public class Blinker {

    private final SingleZeroDivisionStrategy singleZeroDivisionStrategy = new SingleZeroDivisionStrategy();
    private final EvenDigitsDivisionStrategy evenDigitsDivisionStrategy = new EvenDigitsDivisionStrategy();
    private final DefaultDivisionStrategy defaultDivisionStrategy = new DefaultDivisionStrategy();

    public List<Stone> blink(List<Stone> stones) {
        List<Stone> blinkResult = new ArrayList<>();
        for (Stone stone : stones) {
            if (singleZeroDivisionStrategy.isApplicable(stone)) {
                blinkResult.addAll(singleZeroDivisionStrategy.divideStone(stone));
            } else if (evenDigitsDivisionStrategy.isApplicable(stone)) {
                blinkResult.addAll(evenDigitsDivisionStrategy.divideStone(stone));
            } else {
                blinkResult.addAll(defaultDivisionStrategy.divideStone(stone));
            }
        }

        return blinkResult;
    }
}
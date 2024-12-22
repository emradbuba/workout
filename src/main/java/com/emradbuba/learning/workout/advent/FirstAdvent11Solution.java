package com.emradbuba.learning.workout.advent;

import com.emradbuba.learning.workout.advent.division.blinker.Blinker;
import com.emradbuba.learning.workout.advent.model.Stone;

import java.util.List;

public class FirstAdvent11Solution implements Advent11Solution {

    @Override
    public int solve(List<Stone> stones, int numberOfBlinks) {
        Blinker blinker = new Blinker();
        for (int i = 0; i < numberOfBlinks; i++) {
            System.out.println("Blinking number " + (i+1) + " / " + numberOfBlinks);
            stones = blinker.blink(stones);
        }
        return stones.size();
    }
}

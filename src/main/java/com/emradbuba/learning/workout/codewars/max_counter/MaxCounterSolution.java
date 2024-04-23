package com.emradbuba.learning.workout.codewars.max_counter;

import java.util.Arrays;

public class MaxCounterSolution {
    public int[] solution(int n, int[] instructionsArray) {
        var processor = new MaxCounter(n);
        for (int instruction : instructionsArray) {
            processor.processInstruction(instruction);
        }
        return processor.getResult();
    }
}

class MaxCounter {
    private final int[] resultArray;
    private int maxCounterValue = 0;

    public MaxCounter(int n) {
        this.resultArray = new int[n];
    }

    public void processInstruction(int instruction) {
        if (isValidInstruction(instruction)) {
            if (instruction > resultArray.length) {
                Arrays.fill(resultArray, maxCounterValue);
            } else {
                maxCounterValue = Math.max(
                        ++resultArray[instruction - 1],
                        maxCounterValue);
            }
        }
    }

    public int[] getResult() {
        return Arrays.copyOf(resultArray, resultArray.length);
    }

    private boolean isValidInstruction(int instruction) {
        return instruction > 0;
    }
}

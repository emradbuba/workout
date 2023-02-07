package com.gitlab.emradbuba.learning.java_examples.codewars.rangeextraction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RangeExtractionSolution {

    private final static int MIN_SEQUENCE_LENGTH = 3;
    private final static int MAX_ACCEPTED_INTERVAL_IN_SEQUENCE = 1;
    private final static String SEPARATOR = ",";

    public static String rangeExtraction(int[] inputArray) {
        List<String> result = new ArrayList<>();
        List<Integer> tmpBuffer = new ArrayList<>();
        tmpBuffer.add(inputArray[0]);
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] - inputArray[i - 1] > MAX_ACCEPTED_INTERVAL_IN_SEQUENCE) {
                result.add(getAndClearBufferContent(tmpBuffer));
                tmpBuffer.clear();
            }
            tmpBuffer.add(inputArray[i]);
        }
        result.add(getAndClearBufferContent(tmpBuffer));
        return String.join(SEPARATOR, result);
    }

    private static String getAndClearBufferContent(List<Integer> buffer) {
        if (buffer.size() < MIN_SEQUENCE_LENGTH) {
            return getBufferContentAsSequence(buffer);
        } else {
            return getBufferContentAsRange(buffer);
        }
    }

    private static String getBufferContentAsRange(List<Integer> buffer) {
        String firstInt = String.valueOf(buffer.get(0));
        String lastInt = String.valueOf(buffer.get(buffer.size() - 1));
        return String.format("%s-%s", firstInt, lastInt);
    }

    private static String getBufferContentAsSequence(List<Integer> buffer) {
        return buffer.stream().map(String::valueOf).collect(Collectors.joining(SEPARATOR));
    }
}

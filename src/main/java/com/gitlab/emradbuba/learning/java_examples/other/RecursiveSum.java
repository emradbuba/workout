package com.gitlab.emradbuba.learning.java_examples.other;

import java.util.Arrays;

public class RecursiveSum {
    public static int calculateSum(int[] array) {
        if(array.length == 0) return 0;
        if (array.length == 1) {
            return array[0];
        }
        int middleIdx = array.length / 2;
        return calculateSum(Arrays.copyOfRange(array, 0, middleIdx))
                + calculateSum(Arrays.copyOfRange(array, middleIdx, array.length));
    }
}

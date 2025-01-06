package com.emradbuba.learning.workout.sorting;

public class QuickSortingAlgorithm implements SortingAlgorithm {
    @Override
    public int[] sortArray(int[] array) {
        if (array == null || array.length < 2) return array;
        useQuickSort(array, 0, array.length - 1);
        return array;
    }

    private void useQuickSort(int[] array, int beginIdx, int endIdx) {
        if (beginIdx >= endIdx) return;
        int middleIdx = (endIdx - beginIdx) / 2 + beginIdx;
        int middleValue = array[middleIdx];

        int tmp = array[endIdx];
        array[endIdx] = middleValue;
        array[middleIdx] = tmp;

        int divisionPoint = beginIdx;
        for (int i = beginIdx; i < endIdx; i++) {
            if (array[i] < middleValue) {
                int swapTmp = array[divisionPoint];
                array[divisionPoint++] = array[i];
                array[i] = swapTmp;
            }
        }
        array[endIdx] = array[divisionPoint];
        array[divisionPoint] = middleValue;

        useQuickSort(array, beginIdx, divisionPoint - 1);
        useQuickSort(array, divisionPoint + 1, endIdx);
    }
}

package com.emradbuba.learning.workout.sorting;

public class QuickSortingAlgorithm2 implements SortingAlgorithm {

    @Override
    public int[] sortArray(int[] array) {
        if (array == null || array.length < 2) return array;
        performQuickSort(array, 0, array.length - 1);
        return array;
    }

    private void performQuickSort(int[] array, int begin, int end) {

        if (begin == end) return;

        int divisionPoint = divideArray(array, begin, end);

        performQuickSort(array, begin, Math.max(begin, divisionPoint - 1));
        performQuickSort(array, Math.min(divisionPoint + 1, end), end);
    }

    private int divideArray(int[] array, int begin, int end) {
        int pivot = array[end]; // assume last element as a "dividing value"
        int lastLowerEqualPivot = begin - 1;
        for (int i = begin; i < end; i++) {
            if (array[i] <= pivot) {
                lastLowerEqualPivot++;
                int tmp = array[i];
                array[i] = array[lastLowerEqualPivot];
                array[lastLowerEqualPivot] = tmp;
            }
        }
        int tmp = array[lastLowerEqualPivot + 1];
        array[lastLowerEqualPivot + 1] = array[end];
        array[end] = tmp;
        return lastLowerEqualPivot + 1;
    }
}

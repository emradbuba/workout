package com.emradbuba.learning.workout.sorting;

public class QuickSortingAlgorithm implements SortingAlgorithm {

    @Override
    public int[] sortArray(int[] array) {
        if (array == null || array.length < 2) return array;

        performQuickSort(array, 0, array.length - 1);

        return array;
    }

    private void performQuickSort(int[] array, int beginIdx, int endIdx) {
        if (beginIdx >= endIdx) return;

        int middleValue = findMiddleValueAndMoveToEnd(array, beginIdx, endIdx);
        int divisionPoint = divideArrayUsingMiddleValue(array, beginIdx, endIdx, middleValue);

        performQuickSort(array, beginIdx, divisionPoint - 1);
        performQuickSort(array, divisionPoint + 1, endIdx);
    }

    /**
     * Moves all elements lower than middleValue to the left and, at the end, put the middle value on a right place.
     */
    private static int divideArrayUsingMiddleValue(int[] array, int beginIdx, int endIdx, int middleValue) {
        int localDivisionIdx = beginIdx;
        for (int i = beginIdx; i < endIdx; i++) {
            if (array[i] < middleValue) {
                int tmp = array[localDivisionIdx];
                array[localDivisionIdx++] = array[i];
                array[i] = tmp;
            }
        }
        array[endIdx] = array[localDivisionIdx];
        array[localDivisionIdx] = middleValue;
        return localDivisionIdx;
    }

    /**
     * Finds a middle values as the middle element in the array range discribed by begin and end indexes.
     */
    private static int findMiddleValueAndMoveToEnd(int[] array, int beginIdx, int endIdx) {
        int middleIdx = (endIdx - beginIdx) / 2 + beginIdx;
        int middleValue = array[middleIdx];
        array[middleIdx] = array[endIdx];
        array[endIdx] = middleValue;
        return middleValue;
    }
}

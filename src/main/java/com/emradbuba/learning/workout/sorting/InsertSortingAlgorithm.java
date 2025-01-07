package com.emradbuba.learning.workout.sorting;

public class InsertSortingAlgorithm implements SortingAlgorithm {

    @Override
    public int[] sortArray(int[] array) {

        if (array != null) {
            performInsertSort(array);
        }

        return array;
    }

    public void performInsertSort(int[] array) {
        if (array == null || array.length == 1) return;
        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];
            int newIndex = i;
            while (newIndex > 0 && currentValue < array[newIndex - 1]) {
                array[newIndex] = array[--newIndex];
            }
            array[newIndex] = currentValue;
        }
    }
}

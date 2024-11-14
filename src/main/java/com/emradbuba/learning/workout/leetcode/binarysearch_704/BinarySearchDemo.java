package com.emradbuba.learning.workout.leetcode.binarysearch_704;

public class BinarySearchDemo {

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 6, 7, 8};// TODO: [2, 5]
        //                  0  1  2  3  4  5  6
        int k = 9;
        int result = search(k, inputArray, 0, inputArray.length - 1);
        System.out.println("Result for " + k + ": " + result);
    }

    private static int search(int k, int[] array, int beginIdx, int endIdx) {
        int middleIdx = ((endIdx - beginIdx) / 2) + beginIdx;
        if(array[middleIdx] == k) {
            return middleIdx;
        }
        if (beginIdx == endIdx) {
            return -1;
        }

        if(array[middleIdx] > k) {
            return search(k, array, beginIdx, middleIdx - 1);
        } else {
            return search(k, array, middleIdx + 1, endIdx);
        }
    }
}

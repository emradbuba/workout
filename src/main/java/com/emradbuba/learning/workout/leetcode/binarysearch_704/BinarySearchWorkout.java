package com.emradbuba.learning.workout.leetcode.binarysearch_704;

public class BinarySearchWorkout implements BinarySearchSolution {

    @Override
    public int search(int[] nums, int target) {

        if (nums == null || nums.length == 0) return -1;

        int leftIndex = 0;
        int rightIndex = nums.length - 1;

        while (leftIndex < rightIndex) {
            int middleIdx = ((rightIndex - leftIndex) / 2) + leftIndex;
            int middleIdxValue = nums[middleIdx];
            if (middleIdxValue == target) return middleIdx;

            leftIndex = middleIdxValue > target ? leftIndex : middleIdx + 1;
            rightIndex = middleIdxValue > target ? middleIdx - 1 : rightIndex;
        }

        return nums[leftIndex] == target ? leftIndex : -1;
    }
}

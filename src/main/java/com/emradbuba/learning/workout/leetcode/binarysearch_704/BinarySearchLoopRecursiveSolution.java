package com.emradbuba.learning.workout.leetcode.binarysearch_704;

public class BinarySearchLoopRecursiveSolution implements BinarySearchSolution {

    @Override
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int beginIdx = 0;
        int endIdx = nums.length - 1;

        while (beginIdx != endIdx) {
            int middleIdx = (endIdx - beginIdx) / 2 + beginIdx;
            int middleValue = nums[middleIdx];

            if (middleValue == target) return middleIdx;

            beginIdx = middleValue < target ? middleIdx + 1 : beginIdx;
            endIdx = middleValue < target ? endIdx : middleIdx;
        }

        return nums[beginIdx] == target ? beginIdx : -1;
    }
}

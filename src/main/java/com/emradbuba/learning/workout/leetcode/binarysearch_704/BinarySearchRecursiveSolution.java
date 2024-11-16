package com.emradbuba.learning.workout.leetcode.binarysearch_704;

public class BinarySearchRecursiveSolution implements BinarySearchSolution {

    @Override
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        return searchInRange(nums, target, 0, nums.length - 1);
    }

    public int searchInRange(int[] nums, int target, int beginIncl, int endIncl) {
        int middleIdx = ((endIncl - beginIncl) / 2) + beginIncl;
        int middleValue = nums[middleIdx];
        if (middleValue == target) return middleIdx;
        if (beginIncl == endIncl) return -1;

        return middleValue < target
                ? searchInRange(nums, target, Math.min(middleIdx + 1, nums.length - 1), endIncl)
                : searchInRange(nums, target, beginIncl, Math.max(middleIdx - 1, 0));
    }
}

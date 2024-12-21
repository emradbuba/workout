package com.emradbuba.learning.workout.leetcode.binarysearch_704;

public class BinarySearchWorkout241221 implements BinarySearchSolution {

    @Override
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        return searchRecursive(nums, target, 0, nums.length - 1);
    }

    private int searchRecursive(int[] nums, int target, int beginIdxIncl, int endIdxIncl) {
        if (beginIdxIncl == endIdxIncl) {
            return nums[beginIdxIncl] == target ? beginIdxIncl : -1;
        }
        int middleIdx = (endIdxIncl - beginIdxIncl) / 2;
        if (nums[middleIdx] == target) return middleIdx;
        return searchRecursive(
                nums, target,
                nums[middleIdx] > target ? beginIdxIncl : beginIdxIncl + 1,
                nums[middleIdx] > target ? endIdxIncl - 1 : endIdxIncl
        );
    }
}

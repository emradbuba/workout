package com.gitlab.emradbuba.learning.java_examples.leetcode.twosum;

public class TwoSumBasicSolution implements TwoSumSolution {
    // TODO: create tests and improve efficiency? Extra hash? preSorting?
    @Override
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}

package com.emradbuba.learning.workout.leetcode.minsizesubarraysum_209;

public class MinimumSizeSubarraySumWrokoutSolution implements MinimumSizeSubarraySumSolution {
    @Override
    public int minSubArrayLen(int target, int[] nums) {
        if (nums == null || nums.length < 1) return 0;
        int left = 0;
        int currentSum = 0;
        int currentResult = Short.MAX_VALUE;

        for(int right = 0; right < nums.length; right++) {
            currentSum += nums[right];
            while(currentSum >= target) {
                currentResult = Math.min(currentResult, right - left + 1);
                currentSum -= nums[left];
                left++;
            }
        }

        return currentResult != Short.MAX_VALUE ? currentResult : 0;
    }
}

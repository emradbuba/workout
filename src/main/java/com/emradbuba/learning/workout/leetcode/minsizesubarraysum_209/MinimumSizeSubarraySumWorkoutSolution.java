package com.emradbuba.learning.workout.leetcode.minsizesubarraysum_209;

public class MinimumSizeSubarraySumWorkoutSolution implements MinimumSizeSubarraySumSolution {
    @Override
    public int minSubArrayLen(int target, int[] nums) {
        int leftIdx = 0, rightIdx = 0;
        int currentSum = 0;
        int result = Integer.MAX_VALUE;
        for(rightIdx = 0; rightIdx < nums.length; rightIdx++) {
            currentSum += nums[rightIdx];
            while(currentSum >= target) {
                result = Math.min(result, rightIdx - leftIdx + 1);
                currentSum -= nums[leftIdx];
                leftIdx++;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}

package com.emradbuba.learning.workout.leetcode.minsizesubarraysum_209;

public class MinimumSizeSubarraySumWorkoutSolution implements MinimumSizeSubarraySumSolution {
    @Override
    public int minSubArrayLen(int target, int[] nums) {
        int currentLength = 0;
        int currentSum = 0;
        int leftIdx = 0;
        int result = Integer.MAX_VALUE;

        for (int currentValue : nums) {
            currentSum += currentValue;
            currentLength++;
            while (currentSum >= target) {
                result = Math.min(result, currentLength--);
                currentSum -= nums[leftIdx++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}

package com.emradbuba.learning.workout.leetcode.minsizesubarraysum_209b;

import java.util.ArrayList;
import java.util.List;

public class MinimumSizeSubarraySumBWorkoutSolution implements MinimumSizeSubarraySumBSolution {

    @Override
    public List<SolutionResult> minSubArrayLen(int target, int[] nums) {
        List<SolutionResult> results = new ArrayList<>();
        int leftIdx = 0;
        int currentSum = 0;
        int shortestLength = Integer.MAX_VALUE;

        for (int rightIdx = 0; rightIdx < nums.length; rightIdx++) {
            currentSum += nums[rightIdx];
            while (currentSum >= target) {
                int length = rightIdx - leftIdx + 1;
                if (length < shortestLength) {
                    results.clear();
                    shortestLength = length;
                }
                if (length == shortestLength) {
                    results.add(new SolutionResult(leftIdx, rightIdx));
                }
                currentSum -= nums[leftIdx++];
            }
        }
        return shortestLength == Integer.MAX_VALUE ? null : results;
    }
}

package com.emradbuba.learning.workout.leetcode.minsizesubarraysum_209b;

import java.util.ArrayList;
import java.util.List;

public class MinimumSizeSubarraySumBWorkoutSolution implements MinimumSizeSubarraySumBSolution {

    @Override
    public List<SolutionResult> minSubArrayLen(int target, int[] nums) {
        List<SolutionResult> solutionResults = new ArrayList<>();
        int leftIdx = 0;
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int rightIdx = 0; rightIdx < nums.length; rightIdx++) {
            currentSum += nums[rightIdx];
            while (currentSum >= target) {
                int length = rightIdx - leftIdx + 1;
                if (length < minLength) {
                    solutionResults.clear();
                    minLength = length;
                }
                if (length == minLength) {
                    solutionResults.add(new SolutionResult(leftIdx, rightIdx));
                }
                currentSum -= nums[leftIdx++];
            }
        }
        return solutionResults;
    }
}

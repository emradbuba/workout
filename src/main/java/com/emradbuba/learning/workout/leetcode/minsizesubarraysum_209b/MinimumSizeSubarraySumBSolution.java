package com.emradbuba.learning.workout.leetcode.minsizesubarraysum_209b;

import java.util.List;

public interface MinimumSizeSubarraySumBSolution {

    List<SolutionResult> minSubArrayLen(int target, int[] nums);

    record SolutionResult(int begin, int end){}
}

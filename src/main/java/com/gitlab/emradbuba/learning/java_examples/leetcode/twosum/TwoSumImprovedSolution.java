package com.gitlab.emradbuba.learning.java_examples.leetcode.twosum;

import java.util.HashMap;

public class TwoSumImprovedSolution implements TwoSumSolution {

    @Override
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int searchedValue = target - nums[i];
            if (hashMap.containsKey(searchedValue)) {
                return new int[]{i, hashMap.get(searchedValue)};
            }
            hashMap.put(nums[i], i);
        }
        return new int[]{};
    }
}

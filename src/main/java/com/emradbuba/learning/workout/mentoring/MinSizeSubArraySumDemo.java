package com.emradbuba.learning.workout.mentoring;

public class MinSizeSubArraySumDemo {
    public static void main(String[] args) {

        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));

    }

    public static int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = 0;
        int bestResult = -1;
        int sum = nums[i];

        while (j < nums.length) {
            while (sum >= target && i < nums.length) {
                bestResult = Math.min(bestResult, j - i + 1);
                sum -= nums[i];
                i++;
            }
            j++;
            sum += nums[j];
        }

        return bestResult;
    }
}

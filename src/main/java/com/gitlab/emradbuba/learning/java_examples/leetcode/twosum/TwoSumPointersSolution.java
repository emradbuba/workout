package com.gitlab.emradbuba.learning.java_examples.leetcode.twosum;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TwoSumPointersSolution implements TwoSumSolution {

    @Override
    public int[] twoSum(int[] nums, int target) {
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            nodes.add(new Node(nums[i], i));
        }
        nodes.sort(Comparator.comparing(o -> o.value));
        int leftIdx = 0;
        int rightIdx = nodes.size() - 1;
        while (leftIdx < rightIdx) {
            // arrayList.get(i) ---> complexity O(1)
            int sum = nodes.get(leftIdx).value + nodes.get(rightIdx).value;
            if (sum == target) {
                return new int[]{nodes.get(leftIdx).index, nodes.get(rightIdx).index};
            }
            if (sum < target) {
                leftIdx++;
            } else {
                rightIdx--;
            }
        }
        return new int[]{};
    }
}

class Node {
    public Integer value;
    public Integer index;

    public Node(Integer value, Integer index) {
        this.value = value;
        this.index = index;
    }
}

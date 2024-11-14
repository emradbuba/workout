package com.emradbuba.learning.workout.leetcode.linkedlistreverse_206;

import java.util.Random;

public class ListNode {

    int val;
    final int id = new Random().nextInt(100);
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "[" + val +"]." + id + " ";
    }
}

package com.emradbuba.learning.workout.leetcode.linkedlistcycle_141;

class ListNode {
    int val;
    ListNode next;

    @Deprecated(forRemoval = true)
    public ListNode() {
        // Only for unit tests...
    }

    public ListNode(int x) {
        val = x;
        next = null;
    }

    @Override
    public String toString() {
        return "[" + val + "]";
    }
}

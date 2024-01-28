package com.gitlab.emradbuba.learning.java_examples.leetcode.linkedlistcycle;

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
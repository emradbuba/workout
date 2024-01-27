package com.gitlab.emradbuba.learning.java_examples.leetcode.likedlistcycle;

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
}

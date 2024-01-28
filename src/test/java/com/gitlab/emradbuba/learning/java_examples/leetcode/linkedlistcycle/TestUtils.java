package com.gitlab.emradbuba.learning.java_examples.leetcode.linkedlistcycle;

public class TestUtils {

    public static ListNode createListNodeForNumber(int posIdx, int... values) {
        ListNode initialNode = new ListNode();
        ListNode recentlyAdded = initialNode;
        int pos = 0;
        ListNode referencedNode = null;
        for (int value : values) {
            ListNode newNode = new ListNode(value);
            if(pos++ == posIdx) referencedNode = newNode;
            recentlyAdded.next = newNode;
            recentlyAdded = newNode;
        }
        recentlyAdded.next = referencedNode;
        return initialNode.next;
    }
}

package com.gitlab.emradbuba.learning.java_examples.leetcode.linkedlistreverse;

public class LinkedListSoReverseRecursiveSolution implements LinkedListReverseSolution {
    @Override
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        if (head.next == null) {
            return new ListNode(head.val);
        }
        ListNode newNode = reverseList(head.next);
        ListNode last = newNode;
        while (last.next != null) {
            last = last.next;
        }
        last.next = head;
        head.next = null;
        return newNode;
    }
}

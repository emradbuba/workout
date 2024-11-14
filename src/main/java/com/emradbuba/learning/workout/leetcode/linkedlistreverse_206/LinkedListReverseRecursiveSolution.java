package com.emradbuba.learning.workout.leetcode.linkedlistreverse_206;

public class LinkedListReverseRecursiveSolution implements LinkedListReverseSolution {
    @Override
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) {
            return new ListNode(head.val);
        }

        ListNode newListHead = reverseList(head.next);
        ListNode newListTail = newListHead;

        while (newListTail.next != null) {
            newListTail = newListTail.next;
        }

        newListTail.next = head;
        head.next = null;
        return newListHead;
    }
}

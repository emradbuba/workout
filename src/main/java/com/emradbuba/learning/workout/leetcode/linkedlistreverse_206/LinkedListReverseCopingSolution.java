package com.emradbuba.learning.workout.leetcode.linkedlistreverse_206;

public class LinkedListReverseCopingSolution implements LinkedListReverseSolution {
    @Override
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) {
            return new ListNode(head.val);
        }

        ListNode newListHead = reverseList(head.next);
        ListNode newListTail = newListHead;
        ListNode headCopy = new ListNode(head.val);

        while (newListTail.next != null) {
            newListTail = newListTail.next;
        }

        newListTail.next = headCopy;
        return newListHead;
    }
}

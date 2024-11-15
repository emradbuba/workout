package com.emradbuba.learning.workout.leetcode.linkedlistreverse_206;

public class LinkedListReverseRecursiveWithoutWhileSolution implements LinkedListReverseSolution {
    @Override
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode newListHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newListHead;
    }
}

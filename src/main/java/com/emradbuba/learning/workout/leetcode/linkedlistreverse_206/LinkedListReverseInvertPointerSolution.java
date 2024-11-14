package com.emradbuba.learning.workout.leetcode.linkedlistreverse_206;

public class LinkedListReverseInvertPointerSolution implements LinkedListReverseSolution {
    @Override
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prevNode = null;
        while (head != null) {
            ListNode nextNodeToVisit = head.next;
            head.next = prevNode;
            prevNode = head;
            head = nextNodeToVisit;
        }
        return prevNode;
    }
}

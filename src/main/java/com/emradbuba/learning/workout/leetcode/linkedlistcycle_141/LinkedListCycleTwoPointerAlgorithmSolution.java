package com.emradbuba.learning.workout.leetcode.linkedlistcycle_141;

public class LinkedListCycleTwoPointerAlgorithmSolution implements LinkedListCycleSolution {

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode firstPointer = head;
        ListNode secondPointer = head;
        while (secondPointer.next != null && secondPointer.next.next != null) {
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next.next;
            if (firstPointer == secondPointer) return true;
        }
        return false;
    }
}

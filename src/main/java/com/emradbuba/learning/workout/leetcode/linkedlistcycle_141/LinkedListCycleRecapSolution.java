package com.emradbuba.learning.workout.leetcode.linkedlistcycle_141;

public class LinkedListCycleRecapSolution implements LinkedListCycleSolution {
    @Override
    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) return false;

        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) return true;
        }

        return false;
    }
}

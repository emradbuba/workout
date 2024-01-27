package com.gitlab.emradbuba.learning.java_examples.leetcode.likedlistcycle;

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

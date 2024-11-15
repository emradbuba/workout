package com.emradbuba.learning.workout.leetcode.addtwonumbers_02;

public class AddTwoNumbersRecapSolution implements AddTwoNumbersSolution {
    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newListDummyHead = new ListNode();
        ListNode recentlyAdded = newListDummyHead;
        ListNode firstPointer = l1, secondPointer = l2;
        int inMemory = 0;
        while (firstPointer != null || secondPointer != null) {
            int sum = (firstPointer != null ? firstPointer.val : 0)
                    + (secondPointer != null ? secondPointer.val : 0)
                    + inMemory;
            inMemory = sum / 10;
            ListNode newNode = new ListNode(sum - inMemory * 10);
            recentlyAdded.next = newNode;
            recentlyAdded = newNode;
            firstPointer = firstPointer == null ? null : firstPointer.next;
            secondPointer = secondPointer == null ? null : secondPointer.next;
        }
        if (inMemory > 0) {
            recentlyAdded.next = new ListNode(inMemory);
        }
        return newListDummyHead.next;
    }
}

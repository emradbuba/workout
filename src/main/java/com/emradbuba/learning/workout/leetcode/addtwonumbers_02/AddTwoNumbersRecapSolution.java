package com.emradbuba.learning.workout.leetcode.addtwonumbers_02;

public class AddTwoNumbersRecapSolution implements AddTwoNumbersSolution {

    @Override
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode fakeHeadNode = new ListNode();
        ListNode recentlyAdded = fakeHeadNode;
        int inMemory = 0;
        while (list1 != null || list2 != null || inMemory > 0) {
            int sum = (list1 != null ? list1.val : 0)
                    + (list2 != null ? list2.val : 0)
                    + inMemory;
            inMemory = sum / 10;
            ListNode newNode = new ListNode(sum - inMemory * 10);
            recentlyAdded.next = newNode;
            recentlyAdded = newNode;
            list1 = list1 == null ? null : list1.next;
            list2 = list2 == null ? null : list2.next;
        }
        return fakeHeadNode.next;
    }
}

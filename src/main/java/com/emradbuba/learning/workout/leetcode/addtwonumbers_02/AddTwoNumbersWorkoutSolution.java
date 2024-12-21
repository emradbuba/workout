package com.emradbuba.learning.workout.leetcode.addtwonumbers_02;

public class AddTwoNumbersWorkoutSolution implements AddTwoNumbersSolution {

    @Override
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode fakeBegin = new ListNode();
        ListNode recentlyAdded = fakeBegin;
        int inMemory = 0;
        while (list1 != null || list2 != null || inMemory != 0) {
            int sum = (list1 != null ? list1.val : 0)
                    + (list2 != null ? list2.val : 0)
                    + inMemory;
            inMemory = sum > 9 ? 1 : 0;
            recentlyAdded.next = new ListNode(sum % 10);
            recentlyAdded = recentlyAdded.next;
            list1 = list1 != null ? list1.next : null;
            list2 = list2 != null ? list2.next : null;
        }
        return fakeBegin.next;
    }
}

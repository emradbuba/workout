package com.emradbuba.learning.workout.leetcode.addtwonumbers;

public class AddTwoNumbersFirstApproachRefactoredInitNode implements AddTwoNumbersSolution {

    // Actual solution method:
    public ListNode addTwoNumbers(ListNode firstList, ListNode secondList) {
        int inMemo = 0;
        ListNode resultListTop = new ListNode();
        ListNode recentlyAddedNode = resultListTop;

        while (firstList != null || secondList != null || inMemo > 0) {
            int sum = (firstList != null ? firstList.val : 0)
                    + (secondList != null ? secondList.val : 0)
                    + inMemo;
            if (firstList != null) firstList = firstList.next;
            if (secondList != null) secondList = secondList.next;
            inMemo = sum / 10;
            ListNode newListNode = new ListNode(sum % 10);
            recentlyAddedNode.next = newListNode;
            recentlyAddedNode = newListNode;
        }
        return resultListTop.next;
    }
}

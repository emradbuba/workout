package com.gitlab.emradbuba.learning.java_examples.leetcode.addtwonumbers;

public class AddTwoNumbersFirstApproachRefactored implements AddTwoNumbersSolution {

    // Actual solution method:
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int inMemo = 0;
        ListNode resultListTop = null;
        ListNode recentlyAddedNode = resultListTop;

        while (l1 != null || l2 != null || inMemo > 0) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            if (inMemo > 0) {
                sum += inMemo;
                inMemo = 0;
            }
            inMemo = sum / 10;
            ListNode newListNode = new ListNode(sum % 10);
            if(resultListTop == null) {
                resultListTop = newListNode;
                recentlyAddedNode = newListNode;
                continue;
            }
            recentlyAddedNode.next = newListNode;
            recentlyAddedNode = newListNode;
        }
        return resultListTop;
    }
}

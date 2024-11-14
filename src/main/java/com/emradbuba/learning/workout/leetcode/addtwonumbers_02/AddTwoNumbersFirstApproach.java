package com.emradbuba.learning.workout.leetcode.addtwonumbers_02;

public class AddTwoNumbersFirstApproach implements AddTwoNumbersSolution {

    // Actual solution method:
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int inMemo = 0;
        ListNode currentL1 = l1;
        ListNode currentL2 = l2;
        ListNode resultTopNode = new ListNode();
        ListNode recentlyAddedNode = resultTopNode;

        do {
            int sum = currentL1.val + currentL2.val + inMemo;
            inMemo = sum >= 10 ? 1 : 0;
            ListNode newNode = new ListNode(sum % 10);
            recentlyAddedNode.next = newNode;
            recentlyAddedNode = newNode;
            currentL1 = currentL1.next;
            currentL2 = currentL2.next;
        } while (currentL1 != null && currentL2 != null);

        ListNode notFinishedListNode = currentL1 == null ? currentL2 : currentL1;
        while (notFinishedListNode != null) {
            int sum = notFinishedListNode.val + inMemo;
            inMemo = sum >= 10 ? 1 : 0;
            ListNode newNode = new ListNode(sum % 10);
            recentlyAddedNode.next = newNode;
            recentlyAddedNode = newNode;
            notFinishedListNode = notFinishedListNode.next;
        }
        if (inMemo == 1) {
            ListNode newNode = new ListNode(1);
            recentlyAddedNode.next = newNode;
        }

        return resultTopNode.next;
    }
}

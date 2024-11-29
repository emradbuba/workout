package com.emradbuba.learning.workout.leetcode.addtwonumbersii_445;

public class AddTwoNumbersIIRevertingWorkoutSolution implements AddTwoNumbersIISolution {

    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode revertedL1 = revertList(l1);
        ListNode revertedL2 = revertList(l2);

        ListNode revertedListSum = addTwoNumbersIntern(revertedL1, revertedL2);

        return revertList(revertedListSum);
    }

    private ListNode revertList(ListNode node) {
        if (node.next == null) return node;
        ListNode newHead = revertList(node.next);
        node.next.next = node;
        node.next = null;
        return newHead;
    }

    private ListNode addTwoNumbersIntern(ListNode list1, ListNode list2) {
        int inMemo = 0;
        ListNode fakeHead = new ListNode();
        ListNode recentNode = fakeHead;

        while (list1 != null || list2 != null || inMemo > 0) {
            int sum = (list1 == null ? 0 : list1.val)
                    + (list2 == null ? 0 : list2.val)
                    + inMemo;
            inMemo = sum / 10;
            recentNode.next = new ListNode(sum % 10);
            recentNode = recentNode.next;
            list1 = (list1 == null ? null : list1.next);
            list2 = (list2 == null ? null : list2.next);
        }

        return fakeHead.next;
    }
}

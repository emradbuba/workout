package com.emradbuba.learning.workout.leetcode.addtwonumbersii_445;

public class AddTwoNumbersIIRevertAddAndRevertSolution implements AddTwoNumbersIISolution {
    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1Reverted = revertList(l1);
        ListNode l2Reverted = revertList(l2);

        ListNode addedRevertedLists = addRevertedLists(l1Reverted, l2Reverted);

        return revertList(addedRevertedLists);
    }

    private ListNode revertList(ListNode head) {
        if (head.next == null) {
            return new ListNode(head.val);
        }
        ListNode newListHead = revertList(head.next);
        ListNode newListTail = newListHead;
        while (newListTail.next != null) {
            newListTail = newListTail.next;
        }
        newListTail.next = head;
        head.next = null;
        return newListHead;
    }

    private ListNode addRevertedLists(ListNode head1, ListNode head2) {
        int inMemo = 0;
        ListNode fakeHeadNode = new ListNode();
        ListNode recentlyAddedNode = fakeHeadNode;
        while (head1 != null || head2 != null || inMemo > 0) {
            int sum = (head1 == null ? 0 : head1.val)
                    + (head2 == null ? 0 : head2.val)
                    + inMemo;
            inMemo = sum / 10;
            ListNode newNode = new ListNode(sum - inMemo * 10);
            recentlyAddedNode.next = newNode;
            recentlyAddedNode = newNode;
            head1 = head1 == null ? null : head1.next;
            head2 = head2 == null ? null : head2.next;
        }
        return fakeHeadNode.next;
    }
}

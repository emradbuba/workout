package com.emradbuba.learning.workout.leetcode.addtwonumbersii_445;

public class AddTwoNumbersIIRevertingSolution implements AddTwoNumbersIISolution {
    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode revertedL1 = revertList(l1);
        ListNode revertedL2 = revertList(l2);

        ListNode revertedSum = addNumbersWhenReverted(revertedL1, revertedL2);

        return revertList(revertedSum);
    }

    private ListNode revertList(ListNode head) {
        if (head.next == null) return head;
        ListNode newHead = revertList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    private ListNode addNumbersWhenReverted(ListNode head1, ListNode head2) {
        int remain = 0;
        ListNode head = new ListNode();
        ListNode recentlyAdded = head;
        while (head1 != null || head2 != null || remain > 0) {
            int sum = (head1 == null ? 0 : head1.val)
                    + (head2 == null ? 0 : head2.val)
                    + remain;
            remain = sum / 10;
            recentlyAdded.next = new ListNode(sum - 10 * remain);
            recentlyAdded = recentlyAdded.next;
            head1 = head1 == null ? null : head1.next;
            head2 = head2 == null ? null : head2.next;
        }

        return head.next;
    }
}

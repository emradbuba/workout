package com.emradbuba.learning.workout.leetcode.reorderlist_143;

public class ReorderListFirstSolution implements ReorderListSolution {

    @Override
    public void reorderList(ListNode head) {

        if (head == null || head.next == null || head.next.next == null) return;

        ListNode secondList = splitList(head);
        ListNode secondListReverted = revertList(secondList);

        mergeLists(head, secondListReverted);
    }

    private ListNode splitList(ListNode head) {
        ListNode lastInFirstList, firstInSecondList;
        for (lastInFirstList = head, firstInSecondList = head; firstInSecondList.next != null && firstInSecondList.next.next != null; lastInFirstList = lastInFirstList.next, firstInSecondList = firstInSecondList.next.next)
            ;
        firstInSecondList = lastInFirstList.next;
        lastInFirstList.next = null;
        return firstInSecondList;
    }

    private ListNode revertList(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode newHead = revertList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    private void mergeLists(ListNode head, ListNode secondList) {

        while (secondList != null) {

            ListNode nextA = head.next;
            ListNode nextB = secondList.next;

            head.next = secondList;
            secondList.next = nextA;
            head = nextA;
            secondList = nextB;
        }

    }
}

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
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode toReturn = slow.next;
        slow.next = null;
        return toReturn;
    }

    private ListNode revertList(ListNode head) {
        if (head.next == null) return head;
        ListNode newHead = revertList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    private void mergeLists(ListNode listA, ListNode listB) {
        while (listA != null && listB != null) {
            ListNode nextA = listA.next;
            ListNode nextB = listB.next;
            listA.next = listB;
            listB.next = nextA;
            listA = nextA;
            listB = nextB;
        }
    }
}

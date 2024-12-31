package com.emradbuba.learning.workout.leetcode.reorderlist_143;

public class ReorderListFirstSolution implements ReorderListSolution {
    @Override
    public void reorderList(ListNode head) { // [1][2][3][=4=][5][6][7] // [1][2][=3=][4][5][6]

        if(head == null || head.next == null || head.next.next == null) return;

        ListNode[] splittedLists = splitList(head);
        ListNode secondList = revertList(splittedLists[1]); // [7][6][5] // [6][5][4]


        ListNode mergedList = mergeLists(head, secondList);

    }

    private ListNode[] splitList(ListNode head) {
        ListNode a, b;
        for (a = head, b = head; b.next != null && b.next.next != null; a = a.next, b = b.next.next) ;
        b = a.next;
        a.next = null;
        return new ListNode[]{head, b};
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

    private ListNode mergeLists(ListNode head, ListNode secondList) {
        // Merge list in such way, that HEAD is the original head...
        // Adjust tests...

        ListNode theHead = head;
        ListNode recentlyAdded = head;

        while (recentlyAdded != null || secondList != null) {

            if ( != null) {
                ListNode newNode = new ListNode(firstList.val);
                recentlyAdded.next = newNode;
                recentlyAdded = newNode;
                firstList = firstList.next;
            }
            if (secondList != null) {
                ListNode newNode = new ListNode(secondList.val);
                recentlyAdded.next = newNode;
                recentlyAdded = newNode;
                secondList = secondList.next;
            }
        }

        return newList.next;
    }
}

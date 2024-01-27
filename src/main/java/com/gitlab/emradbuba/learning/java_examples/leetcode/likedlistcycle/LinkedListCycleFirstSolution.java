package com.gitlab.emradbuba.learning.java_examples.leetcode.likedlistcycle;

public class LinkedListCycleFirstSolution implements LinkedListCycleSolution {

    // This solution "inverts" the 'next' pointer while moving.
    // If there is a cycle, path from already visited node will lead to head,
    // In case of no cycle, path will lead to the end.
    // Corner cases check in preconditions.
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode prevNode = null;
        ListNode currentNode = head;
        while (currentNode != null) {
            ListNode nextJump = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextJump;
        }
        return prevNode == head;
    }
}

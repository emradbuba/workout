package com.emradbuba.learning.workout.leetcode.linkedlistreverse_206;

public class LinkedListReverseMentoringSolution implements LinkedListReverseSolution {
    @Override
    public ListNode reverseList(ListNode head) {
         if(head == null) return null;
         if(head.next == null) return new ListNode(head.val);

         ListNode newlyAddedNode = reverseList(head.next);
         ListNode tail = newlyAddedNode;
         while(tail.next != null) tail = tail.next;
         tail.next = head;
         head.next = null;
         return newlyAddedNode;
    }
}

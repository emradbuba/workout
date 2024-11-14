package com.emradbuba.learning.workout.leetcode.linkedlistreverse_206;

public class TestUtils {

    // createListNode(1, 5, 4, 8) ===> [1][5][4][8]
    public static ListNode createListNode(int... values) {
        ListNode startingListNode = new ListNode();
        ListNode recentlyAdded = startingListNode;
        for (int val : values) {
            ListNode newNode = new ListNode(val);
            recentlyAdded.next = newNode;
            recentlyAdded = newNode;
        }
        return startingListNode.next;
    }

    // [1]->[5]->[4]->[8]  ===>  "1548"
    public static String getListAsStringNumber(ListNode listNode) {
        StringBuilder sb = new StringBuilder();
        while (listNode != null) {
            sb.append(listNode.val);
            listNode = listNode.next;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ListNode listOf123456 = createListNode(1);
        String listOf123456AsString = getListAsStringNumber(listOf123456);
        System.out.println(listOf123456AsString);
    }
}

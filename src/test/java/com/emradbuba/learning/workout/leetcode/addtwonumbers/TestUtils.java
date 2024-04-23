package com.emradbuba.learning.workout.leetcode.addtwonumbers;

public class TestUtils {

    // createListNode("1548") ===> [8]->[4]->[5]->[1]
    public static ListNode createListNodeForNumber(String numberAsString) {
        ListNode startingListNode = null;
        for (char digit : numberAsString.toCharArray()) {
            int val = Integer.parseInt("" + digit);
            startingListNode = new ListNode(val, startingListNode);
        }
        return startingListNode;
    }

    // [8]->[4]->[5]->[1]  ===>  "1548"
    public static String getListAsStringNumber(ListNode listNode) {
        StringBuilder sb = new StringBuilder();
        if (listNode.next != null) {
            sb.append(getListAsStringNumber(listNode.next));
        }
        sb.append(listNode.val);
        return sb.toString();
    }

    public static void main(String[] args) {
        ListNode listOf123456 = createListNodeForNumber("123456");
        String listOf123456AsString = getListAsStringNumber(listOf123456);
        System.out.println(listOf123456AsString);
    }
}

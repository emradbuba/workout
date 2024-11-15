package com.emradbuba.learning.workout.leetcode.addtwonumbersii_445;

public class TestUtils {

    // createListNode("1548") ===> [1]->[5]->[4]->[8]
    public static ListNode createListNodeForNumber(String numberAsString) {
        ListNode fakeHead = new ListNode();
        ListNode tail = fakeHead;
        for (char digit : numberAsString.toCharArray()) {
            tail.next = new ListNode(Integer.parseInt("" + digit));
            tail = tail.next;
        }
        return fakeHead.next;
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
        ListNode listOf123456 = createListNodeForNumber("123456");
        String listOf123456AsString = getListAsStringNumber(listOf123456);
        System.out.println(listOf123456AsString);
    }
}

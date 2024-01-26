package com.gitlab.emradbuba.learning.java_examples.leetcode.addtwonumbers;

import java.math.BigInteger;

public class AddTwoNumbersUsingBigInteger implements AddTwoNumbersSolution {

    public ListNode addTwoNumbers(ListNode firstList, ListNode secondList) {
        BigInteger firstListAsBigInt = new BigInteger(createRealNumberFromList(firstList));
        BigInteger secondListAsBigInt = new BigInteger(createRealNumberFromList(secondList));
        String sumAsString = firstListAsBigInt.add(secondListAsBigInt).toString();
        ListNode resultNode = null;
        for (char c : sumAsString.toCharArray()) {
            resultNode = new ListNode(Integer.parseInt("" + c), resultNode);
        }
        return resultNode;
    }

    private String createRealNumberFromList(ListNode listNode) {
        if (listNode.next == null) {
            return "" + listNode.val;
        }
        return createRealNumberFromList(listNode.next) + listNode.val;

        // Above could be also made without recursion:
        //  - just read in normal order
        //  - create StringBuilder
        //  - use StringBuilder.reverse()
    }
}

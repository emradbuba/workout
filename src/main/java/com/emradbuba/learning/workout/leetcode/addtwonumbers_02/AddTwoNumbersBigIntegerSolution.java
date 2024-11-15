package com.emradbuba.learning.workout.leetcode.addtwonumbers_02;

import java.math.BigInteger;

public class AddTwoNumbersBigIntegerSolution implements AddTwoNumbersSolution {

    public ListNode addTwoNumbers(ListNode firstList, ListNode secondList) {
        BigInteger firstListAsBigInt = new BigInteger(createRealNumberFromList(firstList));
        BigInteger secondListAsBigInt = new BigInteger(createRealNumberFromList(secondList));
        BigInteger sumAsBigInt = firstListAsBigInt.add(secondListAsBigInt);
        ListNode resultNode = null;
        for (char c : sumAsBigInt.toString().toCharArray()) {
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

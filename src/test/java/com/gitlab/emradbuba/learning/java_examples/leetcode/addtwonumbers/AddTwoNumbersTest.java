package com.gitlab.emradbuba.learning.java_examples.leetcode.addtwonumbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.gitlab.emradbuba.learning.java_examples.leetcode.addtwonumbers.TestUtils.createListNodeForNumber;
import static com.gitlab.emradbuba.learning.java_examples.leetcode.addtwonumbers.TestUtils.getListAsStringNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTwoNumbersTest {

    private ListNode firstList, secondList;
    private AddTwoNumbers addTwoNumbers;

    @BeforeEach
    void setUp() {
        addTwoNumbers = new AddTwoNumbers();
    }

    @Test
    void shouldReturnCorrectListForTwo3DigitNumbers() {
        firstList = createListNodeForNumber("123");
        secondList = createListNodeForNumber("123");

        ListNode resultAsList = addTwoNumbers.addTwoNumbers(firstList, secondList);
        String resultAsString = getListAsStringNumber(resultAsList);

        assertEquals("246", resultAsString);
    }

    @Test
    void shouldReturnCorrectListForTwo3DigitNumbersAnd4DigitsSum() {
        firstList = createListNodeForNumber("923");
        secondList = createListNodeForNumber("923");

        ListNode resultAsList = addTwoNumbers.addTwoNumbers(firstList, secondList);
        String resultAsString = getListAsStringNumber(resultAsList);

        assertEquals("1846", resultAsString);
    }

    @Test
    void shouldReturnCorrectListForTwo3DigitNumbersAnd4DigitsSumWithManyDecimalMoves() {
        firstList = createListNodeForNumber("987");
        secondList = createListNodeForNumber("789");

        ListNode resultAsList = addTwoNumbers.addTwoNumbers(firstList, secondList);
        String resultAsString = getListAsStringNumber(resultAsList);

        assertEquals("1776", resultAsString);
    }

    @Test
    void shouldReturnCorrectListFor3DigitAnd6DigitNumbers() {
        firstList = createListNodeForNumber("123");
        secondList = createListNodeForNumber("123456");

        ListNode resultAsList = addTwoNumbers.addTwoNumbers(firstList, secondList);
        String resultAsString = getListAsStringNumber(resultAsList);

        assertEquals("123579", resultAsString);
    }

    @Test
    void shouldReturnCorrectListFor3DigitAnd6DigitNumbersWith7DigitsSum() {
        firstList = createListNodeForNumber("999");
        secondList = createListNodeForNumber("999993");

        ListNode resultAsList = addTwoNumbers.addTwoNumbers(firstList, secondList);
        String resultAsString = getListAsStringNumber(resultAsList);

        assertEquals("1000992", resultAsString);
    }

    @Test
    void shouldReturnCorrectListForTwo1DigitNumber() {
        firstList = createListNodeForNumber("1");
        secondList = createListNodeForNumber("8");

        ListNode resultAsList = addTwoNumbers.addTwoNumbers(firstList, secondList);
        String resultAsString = getListAsStringNumber(resultAsList);

        assertEquals("9", resultAsString);
    }

    @Test
    void shouldReturnCorrectListWhenFirstIsZero() {
        firstList = createListNodeForNumber("0");
        secondList = createListNodeForNumber("123");

        ListNode resultAsList = addTwoNumbers.addTwoNumbers(firstList, secondList);
        String resultAsString = getListAsStringNumber(resultAsList);

        assertEquals("123", resultAsString);
    }

    @Test
    void shouldReturnCorrectListWhenSecondIsZero() {
        firstList = createListNodeForNumber("123");
        secondList = createListNodeForNumber("0");

        ListNode resultAsList = addTwoNumbers.addTwoNumbers(firstList, secondList);
        String resultAsString = getListAsStringNumber(resultAsList);

        assertEquals("123", resultAsString);
    }

    @Test
    void shouldReturnCorrectListWhenBothAreZeros() {
        firstList = createListNodeForNumber("0");
        secondList = createListNodeForNumber("0");

        ListNode resultAsList = addTwoNumbers.addTwoNumbers(firstList, secondList);
        String resultAsString = getListAsStringNumber(resultAsList);

        assertEquals("0", resultAsString);
    }
}
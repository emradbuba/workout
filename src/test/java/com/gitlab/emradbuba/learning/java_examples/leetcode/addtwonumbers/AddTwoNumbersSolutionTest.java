package com.gitlab.emradbuba.learning.java_examples.leetcode.addtwonumbers;

import com.gitlab.emradbuba.learning.java_examples.leetcode.TestAllImplementations;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static com.gitlab.emradbuba.learning.java_examples.leetcode.addtwonumbers.TestUtils.createListNodeForNumber;
import static com.gitlab.emradbuba.learning.java_examples.leetcode.addtwonumbers.TestUtils.getListAsStringNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTwoNumbersSolutionTest {

    @TestAllImplementations
    void shouldReturnCorrectListForTwo3DigitNumbers(AddTwoNumbersSolution addTwoNumbersSolution) {
        ListNode firstList = createListNodeForNumber("123");
        ListNode secondList = createListNodeForNumber("123");

        ListNode resultAsList = addTwoNumbersSolution.addTwoNumbers(firstList, secondList);
        String resultAsString = getListAsStringNumber(resultAsList);

        assertEquals("246", resultAsString);
    }

    @TestAllImplementations
    void shouldReturnCorrectListForTwo3DigitNumbersAnd4DigitsSum(AddTwoNumbersSolution addTwoNumbersSolution) {
        ListNode firstList = createListNodeForNumber("923");
        ListNode secondList = createListNodeForNumber("923");

        ListNode resultAsList = addTwoNumbersSolution.addTwoNumbers(firstList, secondList);
        String resultAsString = getListAsStringNumber(resultAsList);

        assertEquals("1846", resultAsString);
    }

    @TestAllImplementations
    void shouldReturnCorrectListForTwo3DigitNumbersAnd4DigitsSumWithManyDecimalMoves(AddTwoNumbersSolution addTwoNumbersSolution) {
        ListNode firstList = createListNodeForNumber("987");
        ListNode secondList = createListNodeForNumber("789");

        ListNode resultAsList = addTwoNumbersSolution.addTwoNumbers(firstList, secondList);
        String resultAsString = getListAsStringNumber(resultAsList);

        assertEquals("1776", resultAsString);
    }

    @TestAllImplementations
    void shouldReturnCorrectListFor3DigitAnd6DigitNumbers(AddTwoNumbersSolution addTwoNumbersSolution) {
        ListNode firstList = createListNodeForNumber("123");
        ListNode secondList = createListNodeForNumber("123456");

        ListNode resultAsList = addTwoNumbersSolution.addTwoNumbers(firstList, secondList);
        String resultAsString = getListAsStringNumber(resultAsList);

        assertEquals("123579", resultAsString);
    }

    @TestAllImplementations
    void shouldReturnCorrectListFor3DigitAnd6DigitNumbersWith7DigitsSum(AddTwoNumbersSolution addTwoNumbersSolution) {
        ListNode firstList = createListNodeForNumber("999");
        ListNode secondList = createListNodeForNumber("999993");

        ListNode resultAsList = addTwoNumbersSolution.addTwoNumbers(firstList, secondList);
        String resultAsString = getListAsStringNumber(resultAsList);

        assertEquals("1000992", resultAsString);
    }

    @TestAllImplementations
    void shouldReturnCorrectListForTwo1DigitNumber(AddTwoNumbersSolution addTwoNumbersSolution) {
        ListNode firstList = createListNodeForNumber("1");
        ListNode secondList = createListNodeForNumber("8");

        ListNode resultAsList = addTwoNumbersSolution.addTwoNumbers(firstList, secondList);
        String resultAsString = getListAsStringNumber(resultAsList);

        assertEquals("9", resultAsString);
    }

    @TestAllImplementations
    void shouldReturnCorrectListWhenFirstIsZero(AddTwoNumbersSolution addTwoNumbersSolution) {
        ListNode firstList = createListNodeForNumber("0");
        ListNode secondList = createListNodeForNumber("123");

        ListNode resultAsList = addTwoNumbersSolution.addTwoNumbers(firstList, secondList);
        String resultAsString = getListAsStringNumber(resultAsList);

        assertEquals("123", resultAsString);
    }

    @TestAllImplementations
    void shouldReturnCorrectListWhenSecondIsZero(AddTwoNumbersSolution addTwoNumbersSolution) {
        ListNode firstList = createListNodeForNumber("123");
        ListNode secondList = createListNodeForNumber("0");

        ListNode resultAsList = addTwoNumbersSolution.addTwoNumbers(firstList, secondList);
        String resultAsString = getListAsStringNumber(resultAsList);

        assertEquals("123", resultAsString);
    }

    @TestAllImplementations
    void shouldReturnCorrectListWhenBothAreZeros(AddTwoNumbersSolution addTwoNumbersSolution) {
        ListNode firstList = createListNodeForNumber("0");
        ListNode secondList = createListNodeForNumber("0");

        ListNode resultAsList = addTwoNumbersSolution.addTwoNumbers(firstList, secondList);
        String resultAsString = getListAsStringNumber(resultAsList);

        assertEquals("0", resultAsString);
    }

    static Stream<Arguments> allImplementations() {
        return Stream.of(
                Arguments.of(new AddTwoNumbersFirstApproach()),
                Arguments.of(new AddTwoNumbersUsingBigInteger()),
                Arguments.of(new AddTwoNumbersFirstApproachRefactored()),
                Arguments.of(new AddTwoNumbersFirstApproachRefactoredInitNode())
        );
    }
}
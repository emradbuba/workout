package com.emradbuba.learning.workout.leetcode.addtwonumbersii_445;

import com.emradbuba.learning.workout.leetcode.TestAllImplementations;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTwoNumbersIISolutionTest {

    @TestAllImplementations
    void shouldReturnCorrectListForTwo3DigitNumbers(String solutionName, AddTwoNumbersIISolution addTwoNumbersSolution) {
        ListNode firstList = TestUtils.createListNodeForNumber("123");
        ListNode secondList = TestUtils.createListNodeForNumber("123");

        ListNode resultAsList = addTwoNumbersSolution.addTwoNumbers(firstList, secondList);
        String resultAsString = TestUtils.getListAsStringNumber(resultAsList);

        assertEquals("246", resultAsString);
    }

    @TestAllImplementations
    void shouldReturnCorrectListForTwo3DigitNumbersAnd4DigitsSum(String solutionName, AddTwoNumbersIISolution addTwoNumbersSolution) {
        ListNode firstList = TestUtils.createListNodeForNumber("923");
        ListNode secondList = TestUtils.createListNodeForNumber("923");

        ListNode resultAsList = addTwoNumbersSolution.addTwoNumbers(firstList, secondList);
        String resultAsString = TestUtils.getListAsStringNumber(resultAsList);

        assertEquals("1846", resultAsString);
    }

    @TestAllImplementations
    void shouldReturnCorrectListForTwo3DigitNumbersAnd4DigitsSumWithManyDecimalMoves(String solutionName, AddTwoNumbersIISolution addTwoNumbersSolution) {
        ListNode firstList = TestUtils.createListNodeForNumber("987");
        ListNode secondList = TestUtils.createListNodeForNumber("789");

        ListNode resultAsList = addTwoNumbersSolution.addTwoNumbers(firstList, secondList);
        String resultAsString = TestUtils.getListAsStringNumber(resultAsList);

        assertEquals("1776", resultAsString);
    }

    @TestAllImplementations
    void shouldReturnCorrectListFor3DigitAnd6DigitNumbers(String solutionName, AddTwoNumbersIISolution addTwoNumbersSolution) {
        ListNode firstList = TestUtils.createListNodeForNumber("123");
        ListNode secondList = TestUtils.createListNodeForNumber("123456");

        ListNode resultAsList = addTwoNumbersSolution.addTwoNumbers(firstList, secondList);
        String resultAsString = TestUtils.getListAsStringNumber(resultAsList);

        assertEquals("123579", resultAsString);
    }

    @TestAllImplementations
    void shouldReturnCorrectListFor3DigitAnd6DigitNumbersWith7DigitsSum(String solutionName, AddTwoNumbersIISolution addTwoNumbersSolution) {
        ListNode firstList = TestUtils.createListNodeForNumber("999");
        ListNode secondList = TestUtils.createListNodeForNumber("999993");

        ListNode resultAsList = addTwoNumbersSolution.addTwoNumbers(firstList, secondList);
        String resultAsString = TestUtils.getListAsStringNumber(resultAsList);

        assertEquals("1000992", resultAsString);
    }

    @TestAllImplementations
    void shouldReturnCorrectListForTwo1DigitNumber(String solutionName, AddTwoNumbersIISolution addTwoNumbersSolution) {
        ListNode firstList = TestUtils.createListNodeForNumber("1");
        ListNode secondList = TestUtils.createListNodeForNumber("8");

        ListNode resultAsList = addTwoNumbersSolution.addTwoNumbers(firstList, secondList);
        String resultAsString = TestUtils.getListAsStringNumber(resultAsList);

        assertEquals("9", resultAsString);
    }

    @TestAllImplementations
    void shouldReturnCorrectListWhenFirstIsZero(String solutionName, AddTwoNumbersIISolution addTwoNumbersSolution) {
        ListNode firstList = TestUtils.createListNodeForNumber("0");
        ListNode secondList = TestUtils.createListNodeForNumber("123");

        ListNode resultAsList = addTwoNumbersSolution.addTwoNumbers(firstList, secondList);
        String resultAsString = TestUtils.getListAsStringNumber(resultAsList);

        assertEquals("123", resultAsString);
    }

    @TestAllImplementations
    void shouldReturnCorrectListWhenSecondIsZero(String solutionName, AddTwoNumbersIISolution addTwoNumbersSolution) {
        ListNode firstList = TestUtils.createListNodeForNumber("123");
        ListNode secondList = TestUtils.createListNodeForNumber("0");

        ListNode resultAsList = addTwoNumbersSolution.addTwoNumbers(firstList, secondList);
        String resultAsString = TestUtils.getListAsStringNumber(resultAsList);

        assertEquals("123", resultAsString);
    }

    @TestAllImplementations
    void shouldReturnCorrectListWhenBothAreZeros(String solutionName, AddTwoNumbersIISolution addTwoNumbersSolution) {
        ListNode firstList = TestUtils.createListNodeForNumber("0");
        ListNode secondList = TestUtils.createListNodeForNumber("0");

        ListNode resultAsList = addTwoNumbersSolution.addTwoNumbers(firstList, secondList);
        String resultAsString = TestUtils.getListAsStringNumber(resultAsList);

        assertEquals("0", resultAsString);
    }

    static Stream<Arguments> allImplementations() {
        return Stream.of(Arguments.of("BasicSolution", new AddTwoNumbersIIRevertingSolution()));
    }

}
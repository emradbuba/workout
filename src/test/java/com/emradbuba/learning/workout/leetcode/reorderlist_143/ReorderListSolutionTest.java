package com.emradbuba.learning.workout.leetcode.reorderlist_143;

import com.emradbuba.learning.workout.leetcode.TestAllImplementations;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReorderListSolutionTest {

    @TestAllImplementations
    void shouldCorrectlyReverseListWhenHappyCaseAndEven(String solutionName, ReorderListSolution solution) {

        ListNode originalList = TestUtils.createListNodeForNumber("123456");

        solution.reorderList(originalList);
        String newListAsString = TestUtils.getListAsStringNumber(originalList);

        assertNotNull(newListAsString);
        assertFalse(newListAsString.isEmpty());
        assertEquals("162534", newListAsString);
    }

    @TestAllImplementations
    void shouldCorrectlyReverseListWhenHappyCaseWithFourDigits(String solutionName, ReorderListSolution solution) {

        ListNode originalList = TestUtils.createListNodeForNumber("1234");

        solution.reorderList(originalList);
        String newListAsString = TestUtils.getListAsStringNumber(originalList);

        assertNotNull(newListAsString);
        assertFalse(newListAsString.isEmpty());
        assertEquals("1423", newListAsString);
    }

    @TestAllImplementations
    void shouldCorrectlyReverseListWhenHappyCaseWithFiveDigits(String solutionName, ReorderListSolution solution) {

        ListNode originalList = TestUtils.createListNodeForNumber("12345");

        solution.reorderList(originalList);
        String newListAsString = TestUtils.getListAsStringNumber(originalList);

        assertNotNull(newListAsString);
        assertFalse(newListAsString.isEmpty());
        assertEquals("15243", newListAsString);
    }

    @TestAllImplementations
    void shouldCorrectlyReverseListWhenHappyCaseAndOdd(String solutionName, ReorderListSolution solution) {

        ListNode originalList = TestUtils.createListNodeForNumber("1234567");

        solution.reorderList(originalList);
        String newListAsString = TestUtils.getListAsStringNumber(originalList);

        assertNotNull(newListAsString);
        assertFalse(newListAsString.isEmpty());
        assertEquals("1726354", newListAsString);
    }

    @TestAllImplementations
    void shouldCorrectlyReverseListWhenHappyCaseAndLengthOfThree(String solutionName, ReorderListSolution solution) {

        ListNode originalList = TestUtils.createListNodeForNumber("123");

        solution.reorderList(originalList);
        String newListAsString = TestUtils.getListAsStringNumber(originalList);

        assertNotNull(newListAsString);
        assertFalse(newListAsString.isEmpty());
        assertEquals("132", newListAsString);
    }

    @TestAllImplementations
    void shouldLeaveTwoElementsListUntouched(String solutionName, ReorderListSolution solution) {

        ListNode originalList = TestUtils.createListNodeForNumber("12");

        solution.reorderList(originalList);
        String newListAsString = TestUtils.getListAsStringNumber(originalList);

        assertNotNull(newListAsString);
        assertFalse(newListAsString.isEmpty());
        assertEquals("12", newListAsString);
    }

    @TestAllImplementations
    void shouldLeaveOneElementListUntouched(String solutionName, ReorderListSolution solution) {

        ListNode originalList = TestUtils.createListNodeForNumber("5");

        solution.reorderList(originalList);
        String newListAsString = TestUtils.getListAsStringNumber(originalList);

        assertNotNull(newListAsString);
        assertFalse(newListAsString.isEmpty());
        assertEquals("5", newListAsString);
    }

    @TestAllImplementations
    void shouldCorrecltyRevertListWhenSameElements(String solutionName, ReorderListSolution solution) {

        ListNode originalList = TestUtils.createListNodeForNumber("1111");

        solution.reorderList(originalList);
        String newListAsString = TestUtils.getListAsStringNumber(originalList);

        assertNotNull(newListAsString);
        assertFalse(newListAsString.isEmpty());
        assertEquals("1111", newListAsString);
    }

    static Stream<Arguments> allImplementations() {
        return Stream.of(Arguments.of("FirstSolution", new ReorderListFirstSolution()));
    }
}
package com.emradbuba.learning.workout.leetcode.reorderlist_143;

import com.emradbuba.learning.workout.leetcode.TestAllImplementations;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReorderListSolutionTest {

    @TestAllImplementations
    void shouldCorrectlyReverseListWhenHappyCaseAndEven(String solutionName, ReorderListSolution solution) {

        ListNode originalList = TestUtils.createListNodeForNumber("123456");

        ListNode newList = solution.reorderList(originalList);
        String newListAsString = TestUtils.getListAsStringNumber(newList);

        assertNotNull(newListAsString);
        assertFalse(newListAsString.isEmpty());
        assertEquals("162534", newListAsString);
    }

    @TestAllImplementations
    void shouldCorrectlyReverseListWhenHappyCaseAndOdd(String solutionName, ReorderListSolution solution) {

        ListNode originalList = TestUtils.createListNodeForNumber("1234567");

        ListNode newList = solution.reorderList(originalList);
        String newListAsString = TestUtils.getListAsStringNumber(newList);

        assertNotNull(newListAsString);
        assertFalse(newListAsString.isEmpty());
        assertEquals("1726354", newListAsString);
    }

    @TestAllImplementations
    void shouldCorrectlyReverseListWhenHappyCaseAndLengthOfThree(String solutionName, ReorderListSolution solution) {

        ListNode originalList = TestUtils.createListNodeForNumber("123");

        ListNode newList = solution.reorderList(originalList);
        String newListAsString = TestUtils.getListAsStringNumber(newList);

        assertNotNull(newListAsString);
        assertFalse(newListAsString.isEmpty());
        assertEquals("132", newListAsString);
    }

    @TestAllImplementations
    void shouldLeaveTwoElementsListUntouched(String solutionName, ReorderListSolution solution) {

        ListNode originalList = TestUtils.createListNodeForNumber("12");

        ListNode newList = solution.reorderList(originalList);
        String newListAsString = TestUtils.getListAsStringNumber(newList);

        assertNotNull(newListAsString);
        assertFalse(newListAsString.isEmpty());
        assertEquals("12", newListAsString);
    }

    @TestAllImplementations
    void shouldLeaveOneElementListUntouched(String solutionName, ReorderListSolution solution) {

        ListNode originalList = TestUtils.createListNodeForNumber("5");

        ListNode newList = solution.reorderList(originalList);
        String newListAsString = TestUtils.getListAsStringNumber(newList);

        assertNotNull(newListAsString);
        assertFalse(newListAsString.isEmpty());
        assertEquals("5", newListAsString);
    }

    @TestAllImplementations
    void shouldCorrecltyRevertListWhenSameElements(String solutionName, ReorderListSolution solution) {

        ListNode originalList = TestUtils.createListNodeForNumber("1111");

        ListNode newList = solution.reorderList(originalList);
        String newListAsString = TestUtils.getListAsStringNumber(newList);

        assertNotNull(newListAsString);
        assertFalse(newListAsString.isEmpty());
        assertEquals("1111", newListAsString);
    }

    @TestAllImplementations
    void shouldDoNothingWhenListNull(String solutionName, ReorderListSolution solution) {

        ListNode newList = solution.reorderList(null);

        assertNull(newList);
    }

    static Stream<Arguments> allImplementations() {
        return Stream.of(Arguments.of("FirstSolution", new ReorderListFirstSolution()));
    }
}
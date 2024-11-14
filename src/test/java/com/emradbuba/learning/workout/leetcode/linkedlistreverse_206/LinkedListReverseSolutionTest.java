package com.emradbuba.learning.workout.leetcode.linkedlistreverse_206;

import com.emradbuba.learning.workout.leetcode.TestAllImplementations;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class LinkedListReverseSolutionTest {

    @TestAllImplementations
    public void shouldReturnReversedListForBasicCaseLong(String testName, LinkedListReverseSolution solution) {
        ListNode list = TestUtils.createListNode(1, 2, 3, 4, 5, 6);

        ListNode reversedList = solution.reverseList(list);
        String reversedListAsString = TestUtils.getListAsStringNumber(reversedList);

        assertEquals("654321", reversedListAsString);
    }

    @TestAllImplementations
    public void shouldReturnReversedListForBasicCaseShort(String testName, LinkedListReverseSolution solution) {
        ListNode list = TestUtils.createListNode(1, 2, 3);

        ListNode reversedList = solution.reverseList(list);

        String reversedListAsString = TestUtils.getListAsStringNumber(reversedList);

        assertEquals("321", reversedListAsString);
    }

    @TestAllImplementations
    public void shouldReturnReversedListWithSameReferences(String testName, LinkedListReverseSolution solution) {
        ListNode list = TestUtils.createListNode(1, 2, 3);
        String originalListString = TestUtils.getListAsStringNumber(list);

        solution.reverseList(list);

        assertEquals(originalListString, TestUtils.getListAsStringNumber(list));
    }

    @TestAllImplementations
    public void shouldReturnReversedListForSingleElementCase(String testName, LinkedListReverseSolution solution) {
        ListNode list = TestUtils.createListNode(1);

        ListNode reversedList = solution.reverseList(list);
        String reversedListAsString = TestUtils.getListAsStringNumber(reversedList);

        assertEquals("1", reversedListAsString);
    }

    @TestAllImplementations
    public void shouldReturnEmptyListForNullElementCase(String testName, LinkedListReverseSolution solution) {
        ListNode reversedList = solution.reverseList(null);
        String reversedListAsString = TestUtils.getListAsStringNumber(reversedList);

        assertEquals("", reversedListAsString);
    }


    static Stream<Arguments> allImplementations() {
        return Stream.of(
                Arguments.of("Reverse pointer solution", new LinkedListReverseInvertPointerSolution()),
                Arguments.of("Recursive solution", new LinkedListReverseRecursiveSolution()),
                Arguments.of("Mentoring solution", new LinkedListReverseMentoringSolution())
        );
    }
}
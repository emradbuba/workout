package com.gitlab.emradbuba.learning.java_examples.leetcode.linkedlistreverse;

import com.gitlab.emradbuba.learning.java_examples.leetcode.TestAllImplementations;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static com.gitlab.emradbuba.learning.java_examples.leetcode.linkedlistreverse.TestUtils.createListNode;
import static com.gitlab.emradbuba.learning.java_examples.leetcode.linkedlistreverse.TestUtils.getListAsStringNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListReverseSolutionTest {

    @TestAllImplementations
    public void shouldReturnReversedListForBasicCase(String testName, LinkedListReverseSolution solution) {
        ListNode list = createListNode(1, 2, 3, 4, 5, 6);

        ListNode reversedList = solution.reverseList(list);
        String reversedListAsString = getListAsStringNumber(reversedList);

        assertEquals("654321", reversedListAsString);
    }

    @TestAllImplementations
    public void shouldReturnReversedListForSingleElementCase(String testName, LinkedListReverseSolution solution) {
        ListNode list = createListNode(1);

        ListNode reversedList = solution.reverseList(list);
        String reversedListAsString = getListAsStringNumber(reversedList);

        assertEquals("1", reversedListAsString);
    }

    @TestAllImplementations
    public void shouldReturnEmptyListForNullElementCase(String testName, LinkedListReverseSolution solution) {
        ListNode list = createListNode(null);

        ListNode reversedList = solution.reverseList(list);
        String reversedListAsString = getListAsStringNumber(reversedList);

        assertEquals("", reversedListAsString);
    }


    static Stream<Arguments> allImplementations() {
        return Stream.of(
                Arguments.of("First solution", new LinkedListSoReverseFirstSolution())
        );
    }
}
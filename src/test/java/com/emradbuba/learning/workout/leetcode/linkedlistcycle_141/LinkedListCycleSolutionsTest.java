package com.emradbuba.learning.workout.leetcode.linkedlistcycle_141;

import com.emradbuba.learning.workout.leetcode.TestAllImplementations;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static com.emradbuba.learning.workout.leetcode.linkedlistcycle_141.TestUtils.createListNodeForNumber;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedListCycleSolutionsTest {

    @TestAllImplementations
    void shouldReturnTrueWhenListContainsCycleOnPos1(String testName, LinkedListCycleSolution linkedListCycleSolution) {
        int posIdx = 1;
        ListNode list = createListNodeForNumber(posIdx, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        assertTrue(linkedListCycleSolution.hasCycle(list));
    }

    @TestAllImplementations
    void shouldReturnTrueWhenListContainsCycleOnePos8(String testName, LinkedListCycleSolution linkedListCycleSolution) {
        int posIdx = 8;
        ListNode list = createListNodeForNumber(posIdx, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        assertTrue(linkedListCycleSolution.hasCycle(list));
    }

    @TestAllImplementations
    void shouldReturnTrueWhenListContainsSelfCycleOneLastElement(String testName,
                                                                 LinkedListCycleSolution linkedListCycleSolution) {
        int posIdx = 9;
        ListNode list = createListNodeForNumber(posIdx, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        assertTrue(linkedListCycleSolution.hasCycle(list));
    }

    @TestAllImplementations
    void shouldReturnTrueWhenListOneElementWithSelfCycle(String testName,
                                                         LinkedListCycleSolution linkedListCycleSolution) {
        assertTrue(linkedListCycleSolution.hasCycle(createListNodeForNumber(0, 1)));
    }


    @TestAllImplementations
    void shouldReturnFalseWhenListDoesNotHaveCycles(String testName, LinkedListCycleSolution linkedListCycleSolution) {
        int posIdx = -1;
        ListNode list = createListNodeForNumber(posIdx, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        assertFalse(linkedListCycleSolution.hasCycle(list));
    }

    @TestAllImplementations
    void shouldReturnFalseWhenListHasOneElement(String testName, LinkedListCycleSolution linkedListCycleSolution) {
        int posIdx = -1;
        ListNode list = createListNodeForNumber(posIdx, 1);

        assertFalse(linkedListCycleSolution.hasCycle(list));
    }

    @TestAllImplementations
    void shouldReturnFalseWhenListIsNull(String testName, LinkedListCycleSolution linkedListCycleSolution) {
        assertFalse(linkedListCycleSolution.hasCycle(null));
    }

    static Stream<Arguments> allImplementations() {
        return Stream.of(
                Arguments.of("First solution", new LinkedListCycleFirstSolution()),
                Arguments.of("Two pointer algo", new LinkedListCycleTwoPointerAlgorithmSolution()),
                Arguments.of("Recap 1", new LinkedListCycleRecapSolution())
        );
    }
}
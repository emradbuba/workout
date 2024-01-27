package com.gitlab.emradbuba.learning.java_examples.leetcode.likedlistcycle;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.stream.Stream;

import static com.gitlab.emradbuba.learning.java_examples.leetcode.likedlistcycle.TestUtils.createListNodeForNumber;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedListCycleFirstSolutionTest {

    @TestAllImplemetations
    void shouldReturnTrueWhenListContainsCycleOnPos1(String testName, LinkedListCycleSolution linkedListCycleSolution) {
        int posIdx = 1;
        ListNode list = createListNodeForNumber(posIdx, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        assertTrue(linkedListCycleSolution.hasCycle(list));
    }

    @TestAllImplemetations
    void shouldReturnTrueWhenListContainsCycleOnePos8(String testName, LinkedListCycleSolution linkedListCycleSolution) {
        int posIdx = 8;
        ListNode list = createListNodeForNumber(posIdx, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        assertTrue(linkedListCycleSolution.hasCycle(list));
    }

    @TestAllImplemetations
    void shouldReturnTrueWhenListContainsSelfCycleOneLastElement(String testName, LinkedListCycleSolution linkedListCycleSolution) {
        int posIdx = 9;
        ListNode list = createListNodeForNumber(posIdx, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        assertTrue(linkedListCycleSolution.hasCycle(list));
    }

    @TestAllImplemetations
    void shouldReturnTrueWhenListOneElementWithSelfCycle(String testName, LinkedListCycleSolution linkedListCycleSolution) {
        assertTrue(linkedListCycleSolution.hasCycle(createListNodeForNumber(0, 1)));
    }


    @TestAllImplemetations
    void shouldReturnFalseWhenListDoesNotHaveCycles(String testName, LinkedListCycleSolution linkedListCycleSolution) {
        int posIdx = -1;
        ListNode list = createListNodeForNumber(posIdx, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        assertFalse(linkedListCycleSolution.hasCycle(list));
    }

    @TestAllImplemetations
    void shouldReturnFalseWhenListHasOneElement(String testName, LinkedListCycleSolution linkedListCycleSolution) {
        int posIdx = -1;
        ListNode list = createListNodeForNumber(posIdx, 1);

        assertFalse(linkedListCycleSolution.hasCycle(list));
    }

    @TestAllImplemetations
    void shouldReturnFalseWhenListIsNull(String testName, LinkedListCycleSolution linkedListCycleSolution) {
        assertFalse(linkedListCycleSolution.hasCycle(null));
    }

    static Stream<Arguments> allImplementations() {
        return Stream.of(
                Arguments.of("First solution", new LinkedListCycleFirstSolution()),
                Arguments.of("Two pointer algo", new LinkedListCycleTwoPointerAlgorithmSolution())
        );
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("allImplementations")
    @Retention(RetentionPolicy.RUNTIME)
    public @interface TestAllImplemetations {
    }
}
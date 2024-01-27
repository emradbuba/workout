package com.gitlab.emradbuba.learning.java_examples.leetcode.likedlistcycle;

import org.junit.jupiter.api.Test;

import static com.gitlab.emradbuba.learning.java_examples.leetcode.likedlistcycle.TestUtils.createListNodeForNumber;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleFirstTest {

    private LinkedListCycleFirst linkedListCycleFirst = new LinkedListCycleFirst();

    @Test
    void shouldReturnTrueWhenListContainsCycleOnPos1() {
        int posIdx = 1;
        ListNode list = createListNodeForNumber(posIdx, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        assertTrue(linkedListCycleFirst.hasCycle(list));
    }

    @Test
    void shouldReturnTrueWhenListContainsCycleOnePos8() {
        int posIdx = 8;
        ListNode list = createListNodeForNumber(posIdx, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        assertTrue(linkedListCycleFirst.hasCycle(list));
    }

    @Test
    void shouldReturnTrueWhenListContainsSelfCycleOneLastElement() {
        int posIdx = 9;
        ListNode list = createListNodeForNumber(posIdx, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        assertTrue(linkedListCycleFirst.hasCycle(list));
    }

    @Test
    void shouldReturnTrueWhenListOneElementWithSelfCycle() {
        assertTrue(linkedListCycleFirst.hasCycle(createListNodeForNumber(0, 1)));
    }


    @Test
    void shouldReturnFalseWhenListDoesNotHaveCycles() {
        int posIdx = -1;
        ListNode list = createListNodeForNumber(posIdx, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        assertFalse(linkedListCycleFirst.hasCycle(list));
    }

    @Test
    void shouldReturnFalseWhenListHasOneElement() {
        int posIdx = -1;
        ListNode list = createListNodeForNumber(posIdx, 1);

        assertFalse(linkedListCycleFirst.hasCycle(list));
    }

    @Test
    void shouldReturnFalseWhenListIsNull() {
        assertFalse(linkedListCycleFirst.hasCycle(null));
    }
}
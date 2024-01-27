package com.gitlab.emradbuba.learning.java_examples.leetcode.likedlistcycle;

import org.junit.jupiter.api.Test;

import static com.gitlab.emradbuba.learning.java_examples.leetcode.likedlistcycle.TestUtils.createListNodeForNumber;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {

    private LinkedListCycle linkedListCycle = new LinkedListCycle();

    @Test
    void shouldReturnTrueWhenListContainsCycleOnPos1() {
        int posIdx = 1;
        ListNode list = createListNodeForNumber(posIdx, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        assertTrue(linkedListCycle.hasCycle(list));
    }

    @Test
    void shouldReturnTrueWhenListContainsCycleOnePos8() {
        int posIdx = 8;
        ListNode list = createListNodeForNumber(posIdx, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        assertTrue(linkedListCycle.hasCycle(list));
    }

    @Test
    void shouldReturnTrueWhenListContainsSeftCycleOneLastElement() {
        int posIdx = 9;
        ListNode list = createListNodeForNumber(posIdx, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        assertTrue(linkedListCycle.hasCycle(list));
    }

    @Test
    void shouldReturnTrueWhenListOneElementWithSelfCycle() {
        assertTrue(linkedListCycle.hasCycle(createListNodeForNumber(0, 1)));
    }


    @Test
    void shouldReturnFalseWhenListDoesNotHaveCycles() {
        int posIdx = -1;
        ListNode list = createListNodeForNumber(posIdx, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        assertFalse(linkedListCycle.hasCycle(list));
    }

    @Test
    void shouldReturnFalseWhenListHasOneElement() {
        int posIdx = -1;
        ListNode list = createListNodeForNumber(posIdx, 1);

        assertFalse(linkedListCycle.hasCycle(list));
    }

    @Test
    void shouldReturnFalseWhenListIsNull() {
        assertFalse(linkedListCycle.hasCycle(null));
    }
}
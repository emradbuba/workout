package com.emradbuba.learning.workout.mentoring.linkedlist.tasks;

import com.emradbuba.learning.workout.mentoring.linkedlist.MyLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MyLinkedListRevertDemoTest {

    MyLinkedList<Integer> myLinkedList;

    @BeforeEach
    void setUp() {
        myLinkedList = new MyLinkedList<>();
    }

    @Test
    void shouldPerformBasicRevertingOperation() {

        myLinkedList.add(100);
        myLinkedList.add(200);
        myLinkedList.add(300);
        myLinkedList.add(400);
        myLinkedList.add(500);

        myLinkedList.revert();

        assertEquals(5, myLinkedList.size());
        assertEquals(500, myLinkedList.get(0));
        assertEquals(400, myLinkedList.get(1));
        assertEquals(300, myLinkedList.get(2));
        assertEquals(200, myLinkedList.get(3));
        assertEquals(100, myLinkedList.get(4));
    }

    @Test
    void shouldPerformBasicRevertingOperationForTwoElements() {

        myLinkedList.add(100);
        myLinkedList.add(200);

        myLinkedList.revert();

        assertEquals(2, myLinkedList.size());
        assertEquals(200, myLinkedList.get(0));
        assertEquals(100, myLinkedList.get(1));
    }

    @Test
    void shouldPerformBasicRevertingOperationForSingletonList() {

        myLinkedList.add(100);

        myLinkedList.revert();

        assertEquals(1, myLinkedList.size());
        assertEquals(100, myLinkedList.get(0));
    }

    @Test
    void shouldRevertDoNothingWhenEmptyList() {

        myLinkedList.revert();

        assertEquals(0, myLinkedList.size());
    }
}
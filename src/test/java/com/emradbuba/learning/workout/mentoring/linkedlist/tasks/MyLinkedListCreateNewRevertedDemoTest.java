package com.emradbuba.learning.workout.mentoring.linkedlist.tasks;

import com.emradbuba.learning.workout.mentoring.linkedlist.MyLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class MyLinkedListCreateNewRevertedDemoTest {

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

        MyLinkedList<Integer> result = myLinkedList.createNewReverted();

        assertEquals(5, myLinkedList.size());
        assertEquals(100, myLinkedList.get(0));
        assertEquals(200, myLinkedList.get(1));
        assertEquals(300, myLinkedList.get(2));
        assertEquals(400, myLinkedList.get(3));
        assertEquals(500, myLinkedList.get(4));

        assertEquals(5, result.size());
        assertEquals(500, result.get(0));
        assertEquals(400, result.get(1));
        assertEquals(300, result.get(2));
        assertEquals(200, result.get(3));
        assertEquals(100, result.get(4));
    }

    @Test
    void shouldPerformBasicRevertingOperationForTwoElements() {

        myLinkedList.add(100);
        myLinkedList.add(200);

        MyLinkedList<Integer> result = myLinkedList.createNewReverted();

        assertEquals(2, myLinkedList.size());
        assertEquals(100, myLinkedList.get(0));
        assertEquals(200, myLinkedList.get(1));

        assertEquals(2, result.size());
        assertEquals(200, result.get(0));
        assertEquals(100, result.get(1));
    }

    @Test
    void shouldPerformBasicRevertingOperationForSingletonList() {

        myLinkedList.add(100);

        MyLinkedList<Integer> result = myLinkedList.createNewReverted();

        assertEquals(1, myLinkedList.size());
        assertEquals(100, myLinkedList.get(0));
        assertEquals(1, result.size());
        assertEquals(100, result.get(0));
        assertNotSame(myLinkedList, result);
        assertNotSame(myLinkedList.get(0), result.get(0));
    }

    @Test
    void shouldRevertDoNothingWhenEmptyList() {

        MyLinkedList<Integer> result = myLinkedList.createNewReverted();

        assertEquals(0, result.size());
        assertNotSame(myLinkedList, result);
    }
}
package com.emradbuba.learning.workout.mentoring.linkedlist.tasks;

import com.emradbuba.learning.workout.mentoring.linkedlist.MyLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyLinkedListRemovalDemoTest {

    MyLinkedList<Integer> myLinkedList;

    @BeforeEach
    void setUp() {
        myLinkedList = new MyLinkedList<>();
    }


    @Test
    void shouldRemovalLeaveEmptyListWhenAllElementRemoved() {
        myLinkedList.add(5);
        myLinkedList.add(3);
        myLinkedList.add(4);

        myLinkedList.remove(0);
        myLinkedList.remove(0);
        myLinkedList.remove(0);

        assertEquals(0, myLinkedList.size());
    }

    @Test
    void shouldRemovalDoNothingWhenIndexOutOfBound() {
        myLinkedList.add(5);
        myLinkedList.add(3);
        myLinkedList.add(4);

        myLinkedList.remove(10);
        myLinkedList.remove(10);
        myLinkedList.remove(10);

        assertEquals(3, myLinkedList.size());
    }

    @Test
    void shouldRemovalRemoveSingleElement() {
        myLinkedList.add(5);
        myLinkedList.add(3);
        myLinkedList.add(4);
        assertEquals(3, myLinkedList.size(), "Precondition failed!");

        myLinkedList.remove(1);

        assertEquals(2, myLinkedList.size());
    }

    @Test
    void shouldRemovalDoNothingWhenEmptyList() {

        myLinkedList.remove(0);

        assertEquals(0, myLinkedList.size());
    }


}
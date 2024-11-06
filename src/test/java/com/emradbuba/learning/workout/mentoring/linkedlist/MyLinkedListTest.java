package com.emradbuba.learning.workout.mentoring.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MyLinkedListTest {

    MyLinkedList<Integer> myLinkedList;

    @BeforeEach
    void setUp() {
        myLinkedList = new MyLinkedList<>();
    }

    @Test
    void shouldAddElementsWithoutErrors() {
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
    }

    @Test
    void shouldNotRemoveElementsCauseError() {
        myLinkedList.remove(0);

        myLinkedList.add(1);
        myLinkedList.add(2);

        myLinkedList.remove(0);
        myLinkedList.remove(0);
        myLinkedList.remove(0); // should do nothing...
    }

    @Test
    void shouldAddBeConsistentWithSize() {
        Assertions.assertEquals(0, myLinkedList.size());

        myLinkedList.add(3);
        Assertions.assertEquals(1, myLinkedList.size());

        myLinkedList.add(5);
        Assertions.assertEquals(2, myLinkedList.size());
    }

    @Test
    void shouldRemoveBeConsistentWithSize() {

        myLinkedList.add(3);
        myLinkedList.add(5);
        myLinkedList.add(4);
        myLinkedList.add(1);

        Assertions.assertEquals(4, myLinkedList.size());

        myLinkedList.remove(0);
        Assertions.assertEquals(3, myLinkedList.size());

        myLinkedList.remove(1);
        Assertions.assertEquals(2, myLinkedList.size());

        myLinkedList.remove(0);
        Assertions.assertEquals(1, myLinkedList.size());

        myLinkedList.remove(0);
        Assertions.assertEquals(0, myLinkedList.size());
    }

    @Test
    void shouldRemoveDoNothingWhenIndexGreaterThanListSize() {

        myLinkedList.add(3);
        myLinkedList.add(5);
        myLinkedList.add(4);
        myLinkedList.add(1);

        Assertions.assertEquals(4, myLinkedList.size());

        myLinkedList.remove(4);
        Assertions.assertEquals(4, myLinkedList.size());

        myLinkedList.remove(5);
        Assertions.assertEquals(4, myLinkedList.size());
    }
}
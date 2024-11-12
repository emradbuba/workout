package com.emradbuba.learning.workout.mentoring.linkedlist.tasks;

import com.emradbuba.learning.workout.mentoring.linkedlist.MyLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyLinkedListCreationDemoTest {

    MyLinkedList<Integer> myLinkedList;

    @BeforeEach
    void setUp() {
        myLinkedList = new MyLinkedList<>();
    }

    @Test
    void shouldGetSizeReturnZeroForEmptyList() {

        assertEquals(0, myLinkedList.size());
    }

    @Test
    void shouldAddElementsWithoutErrorsAndGetCorrectSize() {
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);

        assertEquals(3, myLinkedList.size());
    }

    @Test
    void shouldAddElementsWithSameValuesAsSeparate() {
        myLinkedList.add(1);
        myLinkedList.add(1);
        myLinkedList.add(1);

        assertEquals(3, myLinkedList.size());
    }
}
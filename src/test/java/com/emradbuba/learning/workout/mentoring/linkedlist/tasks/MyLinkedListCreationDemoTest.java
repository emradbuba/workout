package com.emradbuba.learning.workout.mentoring.linkedlist.tasks;

import com.emradbuba.learning.workout.mentoring.linkedlist.MyLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MyLinkedListCreationDemoTest {

    MyLinkedList<Integer> myLinkedList;

    @BeforeEach
    void setUp() {
        myLinkedList = new MyLinkedList<>();
    }

    @Test
    void shouldGetThrowExceptionWhenOutOfBound() {

        assertThrows(IndexOutOfBoundsException.class, () -> myLinkedList.get(0));

        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        assertThrows(IndexOutOfBoundsException.class, () -> myLinkedList.get(3));
    }

    @Test
    void shouldGetReturnExpectedValueWhenListHasOneElement() {
        myLinkedList.add(98);

        assertEquals(98, myLinkedList.get(0));
    }

    @Test
    void shouldGetReturnExpectedValueWhenListHasManyElements() {
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);

        assertEquals(1, myLinkedList.get(0));
        assertEquals(2, myLinkedList.get(1));
        assertEquals(3, myLinkedList.get(2));
        assertEquals(4, myLinkedList.get(3));
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
package com.emradbuba.learning.workout.mentoring.linkedlist;

import lombok.AllArgsConstructor;

public class MyLinkedList<T> {

    private MyLinkedListElement<T> head;

    public void add(T value) {
        if (head == null) {
            head = new MyLinkedListElement<>(value, null, null);
            return;
        }

        MyLinkedListElement<T> current = head;
        while (current.next != null) {
            current = current.next;
        }

        MyLinkedListElement<T> element = new MyLinkedListElement<>(value, current, null);
        current.next = element;
    }

    public int size() {
        MyLinkedListElement<T> current = head;
        int count = 0;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        MyLinkedListElement<T> current = head;
        while(current != null) {
            sb.append(" ==> ").append(current);
            current = current.next;
        }
        return sb.toString();
    }

    @AllArgsConstructor
    private class MyLinkedListElement<T> {

        private T value;
        private MyLinkedListElement<T> prev;
        private MyLinkedListElement<T> next;

        @Override
        public String toString() {
            return String.format("[%s]", value);
        }
    }
}

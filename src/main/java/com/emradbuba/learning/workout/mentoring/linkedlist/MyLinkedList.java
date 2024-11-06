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

        current.next = new MyLinkedListElement<>(value, current, null);
    }

    public void remove(int index) {
        if (index >= size()) return;
        MyLinkedListElement<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        if(current == head) {
            head = current.next;
        }
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
        while (current != null) {
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

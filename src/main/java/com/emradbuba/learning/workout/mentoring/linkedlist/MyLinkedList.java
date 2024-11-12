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
        if (current == head) {
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

    public T get(int index) {
        return getElement(index).value;
    }

    private MyLinkedListElement<T> getElement(int index) {
        if (index > size() - 1) {
            throw new IndexOutOfBoundsException();
        }

        MyLinkedListElement<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public void revert() {
        int size = size();
        if (size < 2) return;
        this.head = getElement(size - 1);
        MyLinkedListElement<T> current = head;
        while (current != null) {
            MyLinkedListElement<T> tmp = current.next;
            current.next = current.prev;
            current.prev = tmp;
            current = current.next;
        }
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
    private static class MyLinkedListElement<T> {

        private T value;
        private MyLinkedListElement<T> prev;
        private MyLinkedListElement<T> next;

        @Override
        public String toString() {
            return String.format("[%s]", value);
        }
    }
}


// 1.
// [1]->[2]->[3]
// [2]->[4]->[6]

// 3 -> 6 -> 9

// 2. Remove from list --> remove(int index)
// 3. Reverse list
// 4. isCyclic()
// 5. willEverMeet()
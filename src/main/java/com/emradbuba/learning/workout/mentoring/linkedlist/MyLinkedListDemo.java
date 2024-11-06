package com.emradbuba.learning.workout.mentoring.linkedlist;

public class MyLinkedListDemo {

    public static void main(String[] args) {
        MyLinkedList<Integer> myList = new MyLinkedList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        System.out.println(String.format("List (%d items): %s", myList.size(), myList));
    }
}

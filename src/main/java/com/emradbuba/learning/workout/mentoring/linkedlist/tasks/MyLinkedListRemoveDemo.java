package com.emradbuba.learning.workout.mentoring.linkedlist.tasks;

import com.emradbuba.learning.workout.mentoring.linkedlist.MyLinkedList;

public class MyLinkedListRemoveDemo {
    public static void main(String[] args) {


        MyLinkedList<Integer> myList = new MyLinkedList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        System.out.println(String.format("List (%d items): %s", myList.size(), myList));

        myList.remove(1);
        myList.remove(0);
        myList.remove(0);
        myList.remove(1);

        System.out.println(String.format("List (%d items): %s", myList.size(), myList));
    }
}

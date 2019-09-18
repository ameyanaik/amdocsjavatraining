package com.amdocs.training.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {

        List<String> linkedlist = new LinkedList<String>();

        linkedlist.add("one");
        linkedlist.add("two");
        linkedlist.add("three");
        linkedlist.add("four");

        for (String s:linkedlist) {
            System.out.println(s);
        }

        ListIterator<String> iter = linkedlist.listIterator();

        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        while(iter.hasPrevious()) {
            System.out.println(iter.previous());
        }

        linkedlist.forEach(System.out::println);



    }
}

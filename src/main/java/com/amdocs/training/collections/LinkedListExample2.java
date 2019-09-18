package com.amdocs.training.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample2 {

    String name;

    public static void main(String[] args) {
        List<String> linkedlist = new LinkedList<String>();
        linkedlist.add("apple");
        linkedlist.add("orange");
        linkedlist.add("cucumber");

        //linkedlist.forEach(System.out::println);

        ListIterator<String> iter = linkedlist.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        while(iter.hasPrevious()) {
            System.out.println(iter.previous());
        }

    }


}

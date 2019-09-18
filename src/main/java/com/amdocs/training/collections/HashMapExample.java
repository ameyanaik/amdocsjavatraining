package com.amdocs.training.collections;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(10000, "Rahul");
        map.put(10001, "Rohit");
        map.put(10002, "Virat");
        map.put(10003, "Sachin");
        map.put(10004, "Rishi");

        System.out.println(map.get(10003));

        if(map.containsValue("Rohit")){
            System.out.println("Success. Rohit exists in the map");
        }

        map.forEach((integer, s) -> {
            System.out.print(integer+" : ");
            System.out.println(s);
        });

    }
}

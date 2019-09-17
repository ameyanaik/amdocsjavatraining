package com.amdocs.training.conditions;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("Emp1",1001);
        map.put("Emp2",1002);
        map.put("Emp3",1003);
        map.put("Emp4",1004);

        System.out.println(map.get("Emp1"));

        for (Map.Entry mapElement : map.entrySet()) {
            String key = (String)mapElement.getKey();
            int value = ((int)mapElement.getValue());
            System.out.println(key + " : " + value);
        }

        /*Iterator hmIterator = hm.entrySet().iterator();

        // Iterate through the hashmap
        // and add some bonus marks for every student
        System.out.println("HashMap after adding bonus marks:");

        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            int marks = ((int)mapElement.getValue() + 10);
            System.out.println(mapElement.getKey() + " : " + marks);
        }*/
    }
}

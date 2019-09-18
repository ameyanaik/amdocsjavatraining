package com.amdocs.training.tests;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestHashMap {

    @Test
    public void testHashMap() {
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

        Iterator iter = map.entrySet().iterator();

        // Iterate through the hashmap
        System.out.println("HashMap");

        while (iter.hasNext()) {
            Map.Entry mapElement = (Map.Entry)iter.next();
            System.out.println(mapElement.getKey());
        }
    }
}

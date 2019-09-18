package com.amdocs.training.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<String> a1 = new ArrayList<String>();

        a1.add("Ram");
        a1.add("John");
        a1.add("Sam");

        List<String> a2 = new ArrayList<String>();

        for(int i=0; i<a1.size(); i++) {
            a2.add(a1.get(i));
        }

        for (String s : a1) {
            a2.add(s);
        }

        if(a2.equals(a1)) {
            System.out.println("Equal");
        }

        System.out.println(a2);

        for (String s : a2) {
            System.out.println(s);
        }
    }

}

package com.amdocs.training.exceptions;

import java.lang.reflect.Array;

public class OutOfBoundsException {

    public static void main(String[] args) {

        int[] a = {1,2,3,4};

        try {
            System.out.println("Inside Try");
            System.out.println(a[3]);

        } catch (Exception e) {
            System.out.println("Inside Catch");
            System.out.println("Array Index may be out of bounds. Please check");
            //e.printStackTrace();
        } finally {
            System.out.println("Inside Finally Master");
            a = null;
        }

    }
}

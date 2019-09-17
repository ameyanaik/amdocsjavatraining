package com.amdocs.training.exceptions;

public class DivideByZero {

    public static void main(String[] args) {

        int a;

        try {
            a = 2/0;
            //Thread.sleep(2000);

        } catch (Exception e) {
            System.out.println("Inside Catch");
            //e.printStackTrace();
            throw new ArithmeticException();
        }
        finally {
            System.out.println("Inside Finally");
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}

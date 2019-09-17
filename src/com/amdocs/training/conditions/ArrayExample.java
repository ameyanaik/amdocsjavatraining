package com.amdocs.training.conditions;

public class ArrayExample {

    public static int biggerNumber(int[] intArr) {
        int num = 0;
        for(int i=0; i<intArr.length;i++) {
            if (intArr[i] > num) {
                num = intArr[i];
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] myArr = {10,23,34,5};
        System.out.println(biggerNumber(myArr));
    }
}

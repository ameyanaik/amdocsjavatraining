package com.amdocs.training.conditions;

public class StringComparison {

    public static String compareStringsAndReturnBiggerString(String s1, String s2) {
        //logic here
        String result;

        if(s1.length() == s2.length()) {
            result = "The 2 strings are equal in length";
        }
        else if(s1.length()>s2.length()) {
            result = s1;
        }
        else {
            result = s2;
        }
        return result;
    }

    public static void main(String[] args) {
        String resultstring = compareStringsAndReturnBiggerString("stringone","stringtwo");
        System.out.println(resultstring);
    }
}
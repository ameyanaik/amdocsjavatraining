package com.amdocs.training.conditions;

public class SwitchExample {

    public String getMonth(int month) {

        String monthstring = "default";
        switch (month) {
            case 1:
                monthstring = "January";
                break;
            case 2:
                monthstring = "February";
                break;
            case 3:
                monthstring = "March";
                break;
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default:
                monthstring = "Incorrect value entered. Please check";
                break;
        }
        return monthstring;
    }

    public static void main(String[] args) {
        SwitchExample example = new SwitchExample();

        System.out.println(example.getMonth(2));

        int i = 1;
        while (i < 13) {
            System.out.println(example.getMonth(i));
            i++;
        }

        int sum = 0;
        for (int counter = 1; counter <101; counter++) {
            sum=sum+counter;
        }
        System.out.println(sum);
    }
}

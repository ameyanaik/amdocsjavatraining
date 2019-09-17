package com.amdocs.training.oops;

import com.amdocs.app.Human;

public class EmployeeExample {

    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.setFirstname("Rahul");
        e1.setLastname("Dravid");
        e1.setEmployeeID(10001);
        e1.setDepartment("IT");
        e1.setDesignation("Software Engineer");

        e1.printInfo();

        Employee e2 = new Employee();
        e2.printInfo();

        Employee e3 = new Employee("Virat","Kohli",10002,"Sports","Captain");
        e3.printInfo();

        Human h1 = new Employee();
        h1.setFirstname("Maruti");
        h1.setLastname("Prasad");
        h1.setAge(20);
        h1.printInfo();

        Human h2 = new Human();
        h2.setFirstname("Maruti");
        h2.setLastname("Prasad");
        h2.setAge(20);
        h2.printInfo();

        byte b = 2;
        h2.setAge(b);
        h2.printInfo();
    }

}


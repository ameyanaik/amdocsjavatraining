package com.amdocs.app;

public class HumanExample {

    public static void main(String[] args) {

        Human h3 = new Human();
        h3.setFirstname("Tom");
        h3.setLastname("Moody");
        h3.setAge(30);
        System.out.println(h3.getAge());
        h3.talk();
    }
}

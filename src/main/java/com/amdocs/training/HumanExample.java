package com.amdocs.training;

import com.amdocs.app.Human;

public class HumanExample {

    public static void main(String[] args) {
        Human h3 = new Human();
        h3.setFirstname("Tom");
        h3.talk();
        h3.setLastname("Last Name");
        //h3.count = 0;

        Human.count = 5;
    }

}

package com.amdocs.app;

public class Human {

    //States or properties

    private String firstname, lastname;
    private int age;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age+5;
    }

    String gender;

    public static int count=0;

    //Behaviors of the Class
    private void walk() {
        count++;
        System.out.println(firstname+" "+lastname+" is walking: "+count);
    }

    public void talk() {
        count = 0;
        System.out.println(firstname+" "+lastname+" is talking");
        System.out.println(firstname+" "+lastname+" is "+age+" years old");
    }

    public void printInfo() {
        System.out.println("Name: "+getFirstname()+" "+getLastname());
        System.out.println("Age: "+getAge());
    }



    public static void main(String[] args) {

        Human h1 = new Human();

        h1.firstname = "John";
        h1.lastname = "Smith";
        //h1.fullname = h1.firstname.concat(" ").concat(h1.lastname);
        h1.age = 30;


        h1.walk();
        h1.walk();
        h1.talk();
        h1.walk();

        Human h2 = new Human();
        h2.firstname = "Mark";
        h2.lastname = "Kennedy";
        //h2.fullname = h2.firstname+" "+h2.lastname;
        h2.walk();
        h2.talk();
    }
}

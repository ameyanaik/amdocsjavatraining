package com.amdocs.training.oops;

import com.amdocs.app.Human;

public class Employee extends Human {

    //Properties of the class
    private int employeeID;
    private String department;
    private String designation;

    //Constructor

    public Employee() {
        setFirstname("Sachin");
        setLastname("Tendulkar");
        setEmployeeID(10000);
        setDepartment("Sports");
        setDesignation("Batsman");
    }

    public Employee(String fname, String lname, int employeeID, String dept, String des) {
        setFirstname(fname);
        setLastname(lname);
        //this.employeeID = employeeID;
        setEmployeeID(employeeID);
        setDepartment(dept);
        setDesignation(des);
    }

    //Behaviors of the class
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void printInfo() {
        System.out.println("Name: "+getFirstname()+" "+getLastname());
        System.out.println("Emp ID: "+getEmployeeID());
        System.out.println("Emp Dept: "+getDepartment());
        System.out.println("Emp Designation: "+getDesignation());
    }
}

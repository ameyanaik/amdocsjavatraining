package com.amdocs.training.oops;

public class Car implements Vehicle {
    @Override
    public String getType() {
        return "Car";
    }

    @Override
    public void start() {
        System.out.println("Car Starts");
    }

    @Override
    public void stop() {
        System.out.println("Car Stops");
    }

    public void openWindows() {
        System.out.println("Opening Windows");
    }
}

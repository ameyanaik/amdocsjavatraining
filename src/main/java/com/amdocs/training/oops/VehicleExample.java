package com.amdocs.training.oops;

import com.amdocs.training.oops.*;
public class VehicleExample {

    public static void main() {

        Vehicle v = new Car();

        Car c = new Car();

        v.getType();
        v.start();
        v.stop();

        c.getType();
        c.start();
        c.stop();
        c.openWindows();
    }
}

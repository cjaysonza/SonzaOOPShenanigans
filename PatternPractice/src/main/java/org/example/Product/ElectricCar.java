package org.example.Product;

import org.example.Factory.Vehicle;

public class ElectricCar extends Car implements Vehicle {
    @Override
    public void run() {
        System.out.println("Zoom Zooooom!");
    }
}

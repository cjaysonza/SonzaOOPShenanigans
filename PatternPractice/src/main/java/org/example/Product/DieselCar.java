package org.example.Product;

import org.example.Factory.Vehicle;

public class DieselCar extends Car implements Vehicle {
    @Override
    public void run() {
        System.out.println("Dug Dug Dug Dug!");
    }
}

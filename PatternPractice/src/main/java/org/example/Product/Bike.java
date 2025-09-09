package org.example.Product;

import org.example.Factory.Vehicle;

public class Bike implements Vehicle {

    @Override
    public void run() {
        System.out.println("Cring Cring!");
    }

}

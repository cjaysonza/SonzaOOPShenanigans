package org.example.Product;

import org.example.Factory.Vehicle;

public class Car implements Vehicle {
    @Override
    public void run() {
        System.out.println("Vroom Vroom!");
    }
}

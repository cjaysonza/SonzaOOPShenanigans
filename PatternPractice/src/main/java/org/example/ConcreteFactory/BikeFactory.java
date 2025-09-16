package org.example.ConcreteFactory;

import org.example.Product.Bike;

public class BikeFactory {
    public static Bike createVehicle() {
        return new Bike();
    }
}

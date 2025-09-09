package org.example.ConcreteFactory;

import org.example.Product.Car;

public class CarFactory {
    public static Car createVehicle() {
        return new Car();
    }

}

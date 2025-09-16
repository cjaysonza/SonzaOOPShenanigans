package org.example.ConcreteProductFactory;

import org.example.Product.ElectricCar;

public class ElectricCarFactory {
    public static ElectricCar createVehicle(){
        return new ElectricCar();
    }
}

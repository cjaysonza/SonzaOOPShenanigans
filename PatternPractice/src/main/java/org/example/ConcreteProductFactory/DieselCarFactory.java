package org.example.ConcreteProductFactory;

import org.example.Product.DieselCar;

public class DieselCarFactory {
    public static DieselCar createVehicle(){
        return new DieselCar();
    }
}

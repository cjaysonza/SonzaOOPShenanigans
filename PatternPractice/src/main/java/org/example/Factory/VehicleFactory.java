package org.example.Factory;

import org.example.ConcreteFactory.BikeFactory;
import org.example.ConcreteFactory.CarFactory;
import org.example.ConcreteProductFactory.DieselCarFactory;
import org.example.ConcreteProductFactory.ElectricCarFactory;
import org.example.Product.Bike;
import org.example.Product.Car;
import org.example.Product.DieselCar;
import org.example.Product.ElectricCar;

public class VehicleFactory {

    public static Vehicle getVehicle(String type) {
        switch(type) {
            case("CAR") -> {
                return CarFactory.createVehicle();
            }
            case("BIKE") -> {
                return BikeFactory.createVehicle();
            }
            case("ELECTRIC") -> {
                return ElectricCarFactory.createVehicle();
            }
            case("DIESEL") -> {
                return DieselCarFactory.createVehicle();
            }
            default -> {
                return new Car();
            }
        }
        // End of Switch Case
    }

    // Overload, with CarType
    public static Vehicle getVehicle(String type, String carType) {
        switch(type) {
            case("CAR") -> {
                return carType.equalsIgnoreCase("DIESEL") ? new DieselCar() : new ElectricCar();
            }
            case("BIKE") -> {
                return new Bike();
            }
            default -> {
                return new Car();
            }
        }
        // End of Switch Case
    }

}

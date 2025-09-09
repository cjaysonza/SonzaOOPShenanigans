package org.example;

import org.example.Factory.Vehicle;
import org.example.Factory.VehicleFactory;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // This is to test Factory Patterns
        Scanner input = new Scanner(System.in);
        System.out.print("Starting Text. Type Here -> ");
        String something = input.next();

        Vehicle vehicle = VehicleFactory.getVehicle(something);
        vehicle.run();


//        Vehicle vehicle = VehicleFactory.getVehicle("CAR");
//        vehicle.run();

//        Vehicle vehicle = VehicleFactory.getVehicle("asdf");
//        vehicle.run();



    }
}
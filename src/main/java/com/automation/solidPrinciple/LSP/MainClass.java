package com.automation.solidPrinciple.LSP;

import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Bycycle());
        vehicleList.add(new Car());

        for(Vehicle vehicle:vehicleList){
            System.out.println(vehicle.numberOfVehicle().toString());

        }

    }
}

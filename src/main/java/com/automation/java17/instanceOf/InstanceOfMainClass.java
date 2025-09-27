package com.automation.java17.instanceOf;

public class InstanceOfMainClass {

    public static void vehicleMethod(Vehicle vehicle) {

        if (vehicle instanceof Car car) {
            System.out.println(car);
        } else if (vehicle instanceof Truck truck) {
            System.out.println(truck);
        }
    }
    public static void main(String[] args) {

        Vehicle vehicle = new Car("Alto", "Maruti" );
        vehicleMethod(vehicle);

    }
}

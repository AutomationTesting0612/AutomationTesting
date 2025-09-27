package com.automation.java17.instanceOf;

public record Truck(String name, String brand) implements Vehicle {
    @Override
    public String vehicleName() {
        return name;
    }

    @Override
    public String brandName() {
        return brand;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}

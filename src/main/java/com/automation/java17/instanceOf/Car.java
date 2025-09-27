package com.automation.java17.instanceOf;

public record Car(String name, String brand) implements Vehicle {
    @Override
    public String vehicleName() {
        return name;
    }

    @Override
    public String brandName() {
        return brand;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}

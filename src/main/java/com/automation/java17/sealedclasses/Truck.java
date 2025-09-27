package com.automation.java17.sealedclasses;

public record Truck(String name, String registrationNumber) implements Vehicle {

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getName() {
        return name;
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
        return "Truck{" +
                "name='" + name + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}

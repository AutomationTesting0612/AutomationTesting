package com.automation.java17.instanceOf;

public sealed interface Vehicle permits Car, Truck {

    String vehicleName();

    String brandName();
}

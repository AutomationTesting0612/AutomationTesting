package com.automation.java17.sealedclasses;

public sealed interface Vehicle permits Car, Truck {

    String getRegistrationNumber();

    String getName();
}

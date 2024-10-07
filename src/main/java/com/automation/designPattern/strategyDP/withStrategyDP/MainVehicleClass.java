package com.automation.designPattern.strategyDP.withStrategyDP;

public class MainVehicleClass {

    public static void main(String[] args) {

        Vehicle drive= new PassangerVehicle();
        drive.drive();
    }
}

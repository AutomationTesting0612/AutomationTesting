package com.automation.designPattern.strategyDP.withStrategyDP;

import com.automation.designPattern.strategyDP.withStrategyDP.strategy.StrategyDrive;

public class Vehicle {

    StrategyDrive strategyDrive;

    public Vehicle(StrategyDrive strategyDrive) {
        this.strategyDrive = strategyDrive;
    }

    public void drive(){
        strategyDrive.drive();
    }
}

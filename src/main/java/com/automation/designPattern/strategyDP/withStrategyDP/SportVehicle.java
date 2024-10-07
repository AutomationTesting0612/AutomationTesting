package com.automation.designPattern.strategyDP.withStrategyDP;

import com.automation.designPattern.strategyDP.withStrategyDP.strategy.SpecialStrategy;

public class SportVehicle extends Vehicle {


    public SportVehicle() {
        super(new SpecialStrategy());
    }
}

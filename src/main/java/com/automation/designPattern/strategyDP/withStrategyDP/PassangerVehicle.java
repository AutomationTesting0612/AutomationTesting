package com.automation.designPattern.strategyDP.withStrategyDP;

import com.automation.designPattern.strategyDP.withStrategyDP.strategy.NormalStrategy;

public class PassangerVehicle extends Vehicle {
    public PassangerVehicle() {
        super(new NormalStrategy());
    }
}

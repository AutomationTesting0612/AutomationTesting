package com.automation.designPattern.strategyDP.withStrategyDP;

import com.automation.designPattern.strategyDP.withStrategyDP.strategy.SpecialStrategy;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle() {
        super(new SpecialStrategy());
    }
}

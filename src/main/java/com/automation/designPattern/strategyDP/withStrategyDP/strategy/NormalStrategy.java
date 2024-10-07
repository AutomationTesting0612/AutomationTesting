package com.automation.designPattern.strategyDP.withStrategyDP.strategy;

public class NormalStrategy implements StrategyDrive{
    @Override
    public void drive() {
        System.out.println("This is normal drive strategy");
    }
}

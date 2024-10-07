package com.automation.designPattern.strategyDP.withStrategyDP.strategy;

public class SpecialStrategy implements StrategyDrive{
    @Override
    public void drive() {
        System.out.println("This is special drive strategy");
    }
}

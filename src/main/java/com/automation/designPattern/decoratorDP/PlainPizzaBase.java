package com.automation.designPattern.decoratorDP;

public class PlainPizzaBase implements PizzaBase{
    @Override
    public double cost() {
        return 4.5;
    }

    @Override
    public String getDescription() {
        return "This is Base Pizza";
    }
}

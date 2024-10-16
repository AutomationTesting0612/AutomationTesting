package com.automation.designPattern.decoratorDP;

public class PizzaDecorator implements PizzaBase{

    PizzaBase pizzaBase;

    public PizzaDecorator(PizzaBase pizzaBase) {
        this.pizzaBase = pizzaBase;
    }

    @Override
    public double cost() {
        return pizzaBase.cost();
    }

    @Override
    public String getDescription() {
        return pizzaBase.getDescription();
    }
}

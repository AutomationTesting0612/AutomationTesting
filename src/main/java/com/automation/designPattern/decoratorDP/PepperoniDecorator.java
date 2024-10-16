package com.automation.designPattern.decoratorDP;

public class PepperoniDecorator extends PizzaDecorator {

    public PepperoniDecorator(PizzaBase pizzaBase) {
        super(pizzaBase);
    }

    @Override
    public double cost() {
        return pizzaBase.cost() + 18.5;
    }

    @Override
    public String getDescription() {
        return pizzaBase.getDescription() + "Pepperoni";
    }
}

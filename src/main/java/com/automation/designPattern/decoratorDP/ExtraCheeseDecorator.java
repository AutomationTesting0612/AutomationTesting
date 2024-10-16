package com.automation.designPattern.decoratorDP;

public class ExtraCheeseDecorator extends PizzaDecorator{
    public ExtraCheeseDecorator(PizzaBase pizzaBase) {
        super(pizzaBase);
    }

    @Override
    public double cost() {
        return pizzaBase.cost() + 10.5;
    }

    @Override
    public String getDescription() {
        return pizzaBase.getDescription() + "Extraa cheese";
    }
}

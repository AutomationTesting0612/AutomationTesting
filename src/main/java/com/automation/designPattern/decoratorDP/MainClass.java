package com.automation.designPattern.decoratorDP;

public class MainClass {

    public static void main(String[] args) {


        PizzaBase pizza= new PlainPizzaBase();
        System.out.println(pizza.getDescription()+ "$" + pizza.cost());

        pizza = new ExtraCheeseDecorator(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.cost());
    }
}

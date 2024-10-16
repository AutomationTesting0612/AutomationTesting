package com.automation.designPattern.factoryDP;

public abstract class Plain {

    protected double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }

}

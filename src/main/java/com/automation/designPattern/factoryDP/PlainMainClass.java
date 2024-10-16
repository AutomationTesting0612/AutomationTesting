package com.automation.designPattern.factoryDP;

import com.automation.designPattern.factoryDP.factoryclass.PlainFactory;

public class PlainMainClass {

    public static void main(String[] args) {

        PlainFactory factory= new PlainFactory();
        Plain p = factory.getPlain("COMMERICAL");
        p.getRate();
        p.calculateBill(5);
    }
}

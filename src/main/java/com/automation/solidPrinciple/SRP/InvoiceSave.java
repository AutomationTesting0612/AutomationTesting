package com.automation.solidPrinciple.SRP;

public class InvoiceSave {

    private Marker marker;

    public InvoiceSave(Marker marker) {
        this.marker = marker;
    }

    public void saveToDB(){

        System.out.println("save invoice");

    }
}

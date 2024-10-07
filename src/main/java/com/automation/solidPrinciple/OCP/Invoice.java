package com.automation.solidPrinciple.OCP;

import com.automation.solidPrinciple.SRP.Marker;

public class Invoice {

    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal() {
        return marker.price*this.quantity;
    }

//    public void printInvoice(){
//
//    }
//
//    public void saveToDB(){
//
//    }
}

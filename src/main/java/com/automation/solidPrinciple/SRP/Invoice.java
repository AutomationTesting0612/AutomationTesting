package com.automation.solidPrinciple.SRP;

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

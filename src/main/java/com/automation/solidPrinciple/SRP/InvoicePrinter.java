package com.automation.solidPrinciple.SRP;

public class InvoicePrinter {

    private Marker marker;

    public InvoicePrinter(Marker marker) {
        this.marker = marker;
    }

        public void printInvoice(){
            System.out.println("print the invoice");
      }
}

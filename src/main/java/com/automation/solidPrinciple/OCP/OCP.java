package com.automation.solidPrinciple.OCP;

public class OCP {

    private Invoice invoice;

    public OCP(Invoice invoice) {
        this.invoice = invoice;
    }

    public void save(Invoice invoice){
//        save to DB
    }

//    public void saveToFile(Invoice invoice){
////        save to file
//    }

}

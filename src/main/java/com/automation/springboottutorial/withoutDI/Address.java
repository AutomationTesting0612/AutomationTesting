package com.automation.springboottutorial.withoutDI;

public class Address {

    private String houseNo;
    private String state;
    private String country;
    private String nearby;



//    public Address(String houseNo, String state) {
//        this.houseNo = houseNo;
//        this.state = state;
//    }

    public Address(String houseNo, String state, String country, String nearby) {
        this.houseNo = houseNo;
        this.state = state;
        this.country = country;
        this.nearby= nearby;
    }
}

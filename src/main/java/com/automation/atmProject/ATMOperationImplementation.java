package com.automation.atmProject;

public class ATMOperationImplementation implements AtmOperation{

    ATM atm= new ATM();
    @Override
    public Double viewBalance() {

        System.out.println("The ATM balance is:"+ atm.getBalance());
        if(atm.getBalance()==null) {
            atm.setBalance(Double.valueOf("0"));
        }
        return atm.getBalance();
    }

    @Override
    public void depositAmount(Double amount) {
        if(atm.getBalance()==null) {
            atm.setBalance(Double.valueOf("0"));
        }
        atm.setBalance(atm.getBalance()+amount);
        viewBalance();
    }

    @Override
    public void withDrawAmount(Double amount) {
        if(atm.getBalance()==null) {
            atm.setBalance(Double.valueOf("0"));
        }
        atm.setBalance(atm.getBalance()-amount);
        viewBalance();

    }
}

package com.automation.atmProject;

public class ATM {

    private Double balance;
    private Double depositAmount;
    private Double withDrawAmount;

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(Double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public Double getWithDrawAmount() {
        return withDrawAmount;
    }

    public void setWithDrawAmount(Double withDrawAmount) {
        this.withDrawAmount = withDrawAmount;
    }
}

package com.automation.atmProject;

public interface AtmOperation {

    public Double viewBalance();

    public void depositAmount(Double amount);

    public  void withDrawAmount(Double amount);

}

package com.automation.exceptionClass;

public class Sum {

    private int number1;

    private int number2;

    private int number3;


    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber3() {
        return number3;
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
    }

    public void divideNumbers() {
        number3=number1/0;
    }
}

package com.automation.classes;

import java.util.Objects;

public class Addition {

    private int num1=0;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int methodNum) {
        this.num1 = methodNum;
    }

    public static int num2=0;

    public static void add() {
        num2=15;
    }

    public static int getNum2() {
        return num2;
    }

    public static void setNum2(int num2) {
        Addition.num2 = num2;
    }
}

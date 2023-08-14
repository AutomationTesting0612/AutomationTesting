package com.automation.recurssion;

public class Rec {

    int n = 5;

    static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);

        }
//        System.out.println("the fact number of " + n + "is " + n* fact(n-1));
    }

    public static void main(String test[]) {

        fact(5);
    }
}

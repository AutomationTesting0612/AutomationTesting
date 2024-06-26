package com.automation.recurssion;

public class Fib {

    public static int fib(int n) {

     if (n==0) {
         return 0;
     } else if (n==1 || n==2) {
         return 1;
     } else {
         return fib(n-1) + fib(n-2);
     }
    }

    public static void main(String[] args) {

        int n =5;
        System.out.print("Fibonacci Series of " + n + " numbers is: \n");

        for(int i=0;i<n;i++) {
            System.out.println(fib(i) + "");
        }
    }
}

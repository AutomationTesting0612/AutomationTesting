package com.automation.testing;

import net.bytebuddy.pool.TypePool;

public class Human {

       Human() { //default constructor
       System.out.println("This is default constructor");
   }

   Human(int arms, int legs) {
       System.out.println("This is paramterized constructor having 2 arguments");

   }

    Human(int fingres, int nails, int eyes) {
        System.out.println("This is paramterized constructor having 3 arguments");

    }

    public void run() {
        System.out.println("the Human can run");
    }





}

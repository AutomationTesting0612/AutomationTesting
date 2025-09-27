package com.automation.test;

public class Car1 {

     private static Car1 a;
     private int b;

     private Car1() {

     }

     public int getB() {
          return b;
     }

     public void setB(int b) {
          this.b = b;
     }

     public Car1 getA() {
          return a;
     }

     public static Car1 run() {
          synchronized (Car1.class) {
               if (a == null) {
                    a = new Car1();
               }
               return a;

          }
     }
}

// Constructor
//paramterized Constructor
// Why we need constructor
// How it is impacting while creating the object
//How we can stop to create the object of class
// How we can implement Singleton design pattern

//Design Pattern




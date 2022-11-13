package com.automation.testing;

public class Pen {

    String color; //state of the class
    public void printColor() { // behavior of class
        System.out.println(this.color);
        //this keyword refer to the current class instance variable.
    }
}

class OOPs {
    public static void main(String args[]) {
        //new Pen() is created the object which will be save in heap memory
        // p1 is instance variable which will be save in stack
        Pen p1 = new Pen();
        p1.color="black";
        p1.printColor();
    }
}

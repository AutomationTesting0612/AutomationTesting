package com.automation.testing;

 class Pen {

    String color; //state of the class
    public void printColor() { // behavior of class
        System.out.println(this.color);
        //this keyword refer to the current class instance variable.
    }
}

 class Student {


     String name; //object
     int age;

     public void printInfo() { //method
         System.out.println(this.name);
         System.out.println(this.age);

     }

     Student(){ //Non-Parametrized Constructor
         System.out.println("Constructor Called...");
     }

     Student(String name1, int age1) { //Parameterized Constructor
         this.age=age1;
         this.name=name1;
     }
}

class OOPs {
    public static void main(String args[]) {
        //new Pen() is created the object which will be save in heap memory
        // p1 is instance variable which will be save in stack
//        Pen p1 = new Pen();
//        p1.color="black";
//        p1.printColor();

        Student student = new Student();
        student.name="Automation";
        student.age=10;
        student.printInfo();

        Student student2 = new Student("new", 50);
        student2.printInfo();
    }
}

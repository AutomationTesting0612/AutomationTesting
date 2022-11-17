package com.automation.testing;

 class Pen {

    String color; //state of the class
    public void printColor() { // behavior of class
        System.out.println(this.color);
        //this keyword refer to the current class instance variable.
    }
}

 class Student {


     String name;
     int age;

     public void printInfo() {
         System.out.println(this.name);
         System.out.println(this.age);

     }

     Student(){ //Non-Parametrized Constructor
         System.out.println("Constructor Called...");
     }

     Student(String name, int age) { //Parameterized Constructor
         this.age=age;
         this.name=name;
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

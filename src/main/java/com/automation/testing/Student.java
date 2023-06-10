package com.automation.testing;

public class Student {

    int rollNumber; ///properties

    String name;

    String standard;

    String dress;

    public static void study() { ///method
        System.out.println("Student is studying");
        System.out.println("Student is doing homework");
    }

    public static void homeWork() {///method
        System.out.println("Student is doing homework");
    }

//    ctrl + forward slash/
    public static void main(String args[]) {

        String name = "Anup";
        String sirName="Walia";
        int age = 30;
        int num1=45;
        int num2=60;

        System.out.println("The name is " + name);
        System.out.println("the sirName is " + sirName);
        System.out.println("The full name is " + name + " " +  sirName);
        System.out.println("the age is " + age);
        System.out.println(num1+num2);

//        String--+--Concatenate
//            int-+--> sum



    }




//    Student.java ----> javac ---> Student.class(bytecode) -----> jvm ----> run program



}

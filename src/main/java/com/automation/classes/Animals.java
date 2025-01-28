package com.automation.classes;


//public is a access modifier (who can access this class)

//class is a java keyword which defined the file as class

//Animal is a className

//Access-Modifier class className {
//
//    field decalration
//    method declaration
//
//}
public class Animals {


    static String name="test";

    //methods/behavior
    public static void speak(String speak ) {


    }

    public static void eat() {

    }

    public static void walk() {
        double speed = 30; //local Variable

        System.out.println(speed);

    }

    public static void main(String args[]) {

        Dog test = new Dog();  ///object create---> heap, static----> Meta memory, instance variable
        test.breedTye();
        test.eat();

        System.out.println(name);


        Practice1 practice1 = new Practice1(); //pratice1 is the instance variable name





    }






}

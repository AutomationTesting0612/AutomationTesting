package com.automation.test;

public class MyFirstProgram {

    static int gnum1;
    static int gnum2;
    static int gnum3;

    public static void sum() {

//        int n1=20;
//        int n2=30;
//        int n3=n1+n2;
        gnum1=20;
        gnum2=40;
    }

    public static void evenOrOddNumber() {
        for (int i =0;i<100;i++) {
            System.out.println(i);
            if (i%2==0) {
                System.out.println("The Number is even" + i);
            }
            else {
                System.out.println("The Number is odd" + i);
            }
        }
    }

    public static void main(String[] args) {

//        System.out.println("This is my First program");
//        int num1=20;
////        dataType   variableName  assignment  value;
//        int num2=20;
//        int num3=num1+num2;
//        System.out.println(num3);
//        num3=num3+1;
//        System.out.println(num3);
//
//        num3+= 1;
//        System.out.println(num3);

//        evenOrOddNumber();
        Animals animals = new Animals();
        animals.setName("Tommy");
        animals.setName("Jerman Sheford");
        animals.run();


    }
}


//{}--curely braces---class, method(){}, if else

//[]--square---Array List

//()---test()

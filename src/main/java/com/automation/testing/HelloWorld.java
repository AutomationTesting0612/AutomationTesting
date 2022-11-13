package com.automation.testing;

public class HelloWorld {
//    public is access modifier which tells who can access this class
//    class is a keyword which is written to create a class
//    HelloWorld is the class Name and First letter should be in capital

    public static void main(String args[]) {

//    public is access modifier which tells who can access this method
//    static is a keyword which doesn't create the object. If a class/method is static then java compiler can call it  without creating the object.
//    void tells whether method is returning any anything. if method has void then that method will not return anything.
//     main is keyword which tells from where the program will execute

        System.out.println("My First Program");

//     System.out.println("'") is used to print the statement
        multiply();
    }

    public static void sum() {
        int s1=30;
        int s2=60;
        int sum;
        sum=s1+s2;
        System.out.println(sum);
    }

    public static void multiply(){
        int s1=30;
        int s2=60;
        int multiply;
        multiply=s1*s2;
        System.out.println(multiply);

        sum();


    }

}

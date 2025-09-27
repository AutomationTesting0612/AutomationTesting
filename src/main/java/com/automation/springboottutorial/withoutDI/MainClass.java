package com.automation.springboottutorial.withoutDI;

public class MainClass {

    public static void main(String[] args) {

        Address add = new Address("","","","");

        Student stu= new Student("name", "32", add);
    }
}

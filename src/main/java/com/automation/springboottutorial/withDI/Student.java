package com.automation.springboottutorial.withDI;

public class Student {

    private String name;
    private String age;
    private Information information;

    public Student(String name, String age, Address add) {
        this.name = name;
        this.age = age;
//        this.add = add;
    }
}

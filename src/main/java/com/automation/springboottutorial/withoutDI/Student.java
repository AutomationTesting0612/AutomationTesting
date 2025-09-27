package com.automation.springboottutorial.withoutDI;

public class Student {

    private String name;
    private String age;
    private Address add;

    public Student(String name, String age, Address add) {
        this.name = name;
        this.age = age;
        this.add = add;
    }
}

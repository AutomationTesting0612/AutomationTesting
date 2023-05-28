package com.automation.testing;

public class Dog implements Animal{

    @Override
    public void speak() {

        System.out.println("Dog bark");

    }

    @Override
    public void smell() {

        System.out.println("Dog smell");

    }

    @Override
    public void speed() {
        System.out.println("The speed of dog is 45km/h");
    }
}

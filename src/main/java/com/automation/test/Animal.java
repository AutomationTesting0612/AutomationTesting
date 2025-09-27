package com.automation.test;

public interface Animal {

    public void walk(); //non-implemented/abstract method

    public void eat();

    public void speak();


    default void run() {

       System.out.println("The max speed of animal" + 200);
    }

}




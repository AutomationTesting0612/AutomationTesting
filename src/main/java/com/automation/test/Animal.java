package com.automation.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public interface Animal {

    public void walk(); //non-implemented/abstract method

    public void eat();

    public void speak();
//    jdk 7--> java 8

    default void run() {

    }

}




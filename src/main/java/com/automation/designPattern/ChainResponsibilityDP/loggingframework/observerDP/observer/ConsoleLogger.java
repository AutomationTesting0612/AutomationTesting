package com.automation.designPattern.ChainResponsibilityDP.loggingframework.observerDP.observer;

import com.automation.designPattern.ChainResponsibilityDP.loggingframework.observerDP.subject.LogSubject;

public class ConsoleLogger implements LogObserver{

    String message;
    @Override
    public void log(String message) {
        this.message=message;
        display();

    }

    public void display() {
        System.out.println("This is console log" + message);
    }
}

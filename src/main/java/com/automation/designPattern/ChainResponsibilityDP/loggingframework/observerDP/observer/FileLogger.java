package com.automation.designPattern.ChainResponsibilityDP.loggingframework.observerDP.observer;

public class FileLogger implements LogObserver{

    String message;
    @Override
    public void log(String message) {
        this.message=message;
        display();

    }

    public void display() {
        System.out.println("Write to File log" + message);
    }
}

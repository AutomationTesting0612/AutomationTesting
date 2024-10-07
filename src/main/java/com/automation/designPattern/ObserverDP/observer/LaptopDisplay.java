package com.automation.designPattern.ObserverDP.observer;

public class LaptopDisplay implements Observer{

    public String weather;
    @Override
    public void update(String weather) {
        this.weather=weather;
        display();
    }

    public void display(){
        System.out.println("Laptop Display: Weather updated - " + weather);
    }
}

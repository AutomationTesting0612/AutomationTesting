package com.automation.designPattern.ObserverDP.subject;

import com.automation.designPattern.ObserverDP.observer.Observer;
import com.automation.designPattern.ObserverDP.observer.PhoneDisplay;

public class WeatherApp {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        Observer observer = new PhoneDisplay();
        weatherStation.addObserver(observer);
        weatherStation.setWeather("Rainy");
    }
}

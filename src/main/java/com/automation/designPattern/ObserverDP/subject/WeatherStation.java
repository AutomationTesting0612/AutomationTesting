package com.automation.designPattern.ObserverDP.subject;

import com.automation.designPattern.ObserverDP.observer.Observer;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    List<Observer> observerList= new ArrayList();

    public String weather;
    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {

        for(Observer observer: observerList){
          observer.update(weather);
        }
    }

    public void setWeather(String newWeather){
        this.weather=newWeather;
        notifyObservers();
    }
}

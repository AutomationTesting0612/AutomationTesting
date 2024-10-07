package com.automation.designPattern.ObserverDP.subject;

import com.automation.designPattern.ObserverDP.observer.Observer;

public interface Subject {

    void addObserver(Observer observer);

    void remove(Observer observer);

    void notifyObservers();
}

package com.automation.designPattern.ChainResponsibilityDP.loggingframework.observerDP.subject;

import com.automation.designPattern.ChainResponsibilityDP.loggingframework.observerDP.observer.LogObserver;
import com.automation.designPattern.ObserverDP.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class LogSubjectImplementation implements LogSubject {

    List<LogObserver> logObserverList= new ArrayList();
    @Override
    public void addObserver(int level, LogObserver logObserver) {

        this.logObserverList.add(level, logObserver);

    }

    @Override
    public void notifyAllObserver(String message) {

        for(LogObserver logObserver: logObserverList) {
            logObserver.log(message);
        }

    }
}

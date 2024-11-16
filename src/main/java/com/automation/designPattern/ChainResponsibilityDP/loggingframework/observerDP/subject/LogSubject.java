package com.automation.designPattern.ChainResponsibilityDP.loggingframework.observerDP.subject;

import com.automation.designPattern.ChainResponsibilityDP.loggingframework.observerDP.observer.LogObserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LogSubject {

    Map<Integer, List<LogObserver>> logObserves = new HashMap<>();

    void addObserver(int level, LogObserver logObserver);


    void notifyAllObserver(String message);


}

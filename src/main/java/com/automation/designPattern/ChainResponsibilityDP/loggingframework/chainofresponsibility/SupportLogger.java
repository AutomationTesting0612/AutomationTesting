package com.automation.designPattern.ChainResponsibilityDP.loggingframework.chainofresponsibility;

import com.automation.designPattern.ChainResponsibilityDP.loggingframework.observerDP.subject.LogSubject;

public interface SupportLogger {

    public void getLogger(int level, String message, LogSubject logSubject);

    public void nextLogLevel(SupportLogger logger);

    public void display(String message, LogSubject logSubject);
}

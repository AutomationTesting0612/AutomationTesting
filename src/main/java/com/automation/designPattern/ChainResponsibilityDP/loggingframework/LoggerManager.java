package com.automation.designPattern.ChainResponsibilityDP.loggingframework;

import com.automation.designPattern.ChainResponsibilityDP.loggingframework.chainofresponsibility.*;
import com.automation.designPattern.ChainResponsibilityDP.loggingframework.observerDP.observer.ConsoleLogger;
import com.automation.designPattern.ChainResponsibilityDP.loggingframework.observerDP.observer.FileLogger;
import com.automation.designPattern.ChainResponsibilityDP.loggingframework.observerDP.observer.LogObserver;
import com.automation.designPattern.ChainResponsibilityDP.loggingframework.observerDP.subject.LogSubject;
import com.automation.designPattern.ChainResponsibilityDP.loggingframework.observerDP.subject.LogSubjectImplementation;

public class LoggerManager {

    public static SupportLogger buildChainOfLogger() {
        SupportLogger errorLogger= new ErrorLogger(2);
        SupportLogger infoLogger= new InfoLogger(1);
        SupportLogger debugLogger= new DebugLogger(3);

        infoLogger.nextLogLevel(errorLogger);
        errorLogger.nextLogLevel(debugLogger);

        return infoLogger;

    }

    public static LogSubject buildSubjectOfLogger() {
        LogSubjectImplementation logSubjectImplementation = new LogSubjectImplementation();
        LogObserver consoleObserver= new ConsoleLogger();
        LogObserver fileObserver= new FileLogger();
        logSubjectImplementation.addObserver(0, consoleObserver);
        logSubjectImplementation.addObserver(1, consoleObserver);
        logSubjectImplementation.addObserver(0, fileObserver);

        return logSubjectImplementation;
    }
}

package com.automation.designPattern.ChainResponsibilityDP.loggingframework.singletonDP;

import com.automation.designPattern.ChainResponsibilityDP.loggingframework.chainofresponsibility.Request;
import com.automation.designPattern.ChainResponsibilityDP.loggingframework.chainofresponsibility.SupportLogger;
import com.automation.designPattern.ChainResponsibilityDP.loggingframework.observerDP.observer.LogObserver;
import com.automation.designPattern.ChainResponsibilityDP.loggingframework.observerDP.subject.LogSubject;

import java.io.Serializable;

import static com.automation.designPattern.ChainResponsibilityDP.loggingframework.LoggerManager.buildChainOfLogger;
import static com.automation.designPattern.ChainResponsibilityDP.loggingframework.LoggerManager.buildSubjectOfLogger;

public class Logger implements Serializable, Cloneable {

    private volatile static Logger logger;
    private volatile static SupportLogger buildChainLogger;

    private volatile static LogSubject buildLogSubject;

    private Logger(){
        if(logger!=null){
            throw new IllegalStateException("Object Already created");
        }
    }

    public static Logger getInstance() {
        if(logger==null){
            synchronized (Logger.class){
                logger= new Logger();
                buildChainLogger= buildChainOfLogger();
                buildLogSubject=buildSubjectOfLogger();
            }
        }
        return logger;
    }

    public void createLog(int level, String message) {

        buildChainLogger.getLogger(level, message, buildLogSubject);

    }

    public void info(String msg){
        createLog(1, msg);
    }

    public void error(String msg){
        createLog(2, msg);
    }

    public void debug(String msg){
        createLog(3, msg);
    }


}

package com.automation.designPattern.ChainResponsibilityDP.loggingframework.chainofresponsibility;

import com.automation.designPattern.ChainResponsibilityDP.loggingframework.observerDP.subject.LogSubject;

public class DebugLogger implements SupportLogger {

    private int level;

    private SupportLogger logger;

    public DebugLogger(int level){
        this.level=level;
    }


    @Override
    public void getLogger(int level, String message, LogSubject logSubject) {
      if(this.level<=level){
          display(message, logSubject);

      }
      if(logger!=null){
          logger.getLogger(level, message, logSubject);
      }
    }

    @Override
    public void nextLogLevel(SupportLogger logger) {

        this.logger=logger;
    }

    @Override
    public void display(String message, LogSubject logSubject) {
//        System.out.println("DEBUG : " + message);
        logSubject.notifyAllObserver("DEBUG : " + message);
    }
}

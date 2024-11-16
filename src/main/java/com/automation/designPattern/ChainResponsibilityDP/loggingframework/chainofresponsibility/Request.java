package com.automation.designPattern.ChainResponsibilityDP.loggingframework.chainofresponsibility;

public class Request {

    private LogLevel level;

    public Request(LogLevel level) {
        this.level = level;
    }

    public LogLevel getLevel() {
        return level;
    }
}

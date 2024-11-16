package com.automation.designPattern.ChainResponsibilityDP.chainofResponsibilityDP;

public class Request {

    private Priority priority;

    public Request(Priority priority) {
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }
}

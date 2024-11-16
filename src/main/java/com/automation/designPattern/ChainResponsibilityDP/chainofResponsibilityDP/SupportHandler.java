package com.automation.designPattern.ChainResponsibilityDP.chainofResponsibilityDP;

public interface SupportHandler {

    public void handleRequest(Request request);

    public void setNextHandle(SupportHandler requestHandler);
}

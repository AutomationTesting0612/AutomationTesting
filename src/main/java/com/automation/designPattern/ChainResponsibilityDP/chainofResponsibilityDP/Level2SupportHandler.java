package com.automation.designPattern.ChainResponsibilityDP.chainofResponsibilityDP;

public class Level2SupportHandler implements SupportHandler{

    private SupportHandler supportHandler;
    @Override
    public void handleRequest(Request request) {

        if(request.getPriority()==Priority.INTERMEDIATE) {
            System.out.println("Level 2 support the INTERMEDIATE Request");
        } else {
            supportHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandle(SupportHandler requestHandler) {
      this.supportHandler=requestHandler;
    }
}

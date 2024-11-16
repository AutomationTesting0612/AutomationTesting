package com.automation.designPattern.ChainResponsibilityDP.chainofResponsibilityDP;

public class Level1SupportHandler implements SupportHandler {

    private SupportHandler handler;
    @Override
    public void handleRequest(Request request) {

        if(request.getPriority()==Priority.LOW){
            System.out.println("Level 1 support Handle the Request");
        } else {
            handler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandle(SupportHandler requestHandler) {
      this.handler=requestHandler;
    }
}

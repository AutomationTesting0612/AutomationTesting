package com.automation.designPattern.ChainResponsibilityDP.chainofResponsibilityDP;

public class Level3SupportHandler implements SupportHandler{

    private SupportHandler supportHandler;
    @Override
    public void handleRequest(Request request) {
      if(request.getPriority()==Priority.HIGH){
          System.out.println("Level 3 support the High Request");
      } else {
          System.out.println("Request Cannot be handled");
      }
    }

    @Override
    public void setNextHandle(SupportHandler requestHandler) {

    }
}

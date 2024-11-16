package com.automation.designPattern.ChainResponsibilityDP.chainofResponsibilityDP;

public class SupportHandleMain {

    public static void main(String[] args) {

        SupportHandler supportHandler1 = new Level1SupportHandler();
        SupportHandler supportHandler2 = new Level2SupportHandler();
        SupportHandler supportHandler3 = new Level3SupportHandler();
        supportHandler1.setNextHandle(supportHandler2);
        supportHandler1.setNextHandle(supportHandler3);

        Request request1 = new Request(Priority.LOW);
        Request request2 = new Request(Priority.INTERMEDIATE);
        Request request3 = new Request(Priority.HIGH);

        supportHandler1.handleRequest(request1);
        supportHandler2.handleRequest(request2);
        supportHandler3.handleRequest(request3);

    }
}

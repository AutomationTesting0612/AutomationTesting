package com.automation.designPattern.ChainResponsibilityDP.loggingframework;

import com.automation.designPattern.ChainResponsibilityDP.loggingframework.chainofresponsibility.LogLevel;
import com.automation.designPattern.ChainResponsibilityDP.loggingframework.chainofresponsibility.Request;
import com.automation.designPattern.ChainResponsibilityDP.loggingframework.singletonDP.Logger;

public class LoggerMainClass {

    public static void main(String[] args) {


        Logger logger = Logger.getInstance();
//
//        logger.info("This is Info log");
//        logger.error("This is ERROR log");

        logger.info("This is Info log");

    }
}

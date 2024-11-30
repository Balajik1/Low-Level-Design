package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        LogProcessor logger=new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logger.log(LogProcessor.ERROR,"Value Empty Exception Occured");
        logger.log(LogProcessor.DEBUG,"Debug info comes here");
        logger.log(LogProcessor.INFO,"successfully created object");
    }
}
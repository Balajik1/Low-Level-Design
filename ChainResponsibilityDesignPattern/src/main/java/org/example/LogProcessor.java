package org.example;

public class LogProcessor {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LogProcessor nextLoggerProcessor;

    LogProcessor(LogProcessor nextLogProcessor){
        this.nextLoggerProcessor=nextLogProcessor;
    }

    public void log(int logLevel,String msg){
        if(nextLoggerProcessor != null){
            nextLoggerProcessor.log(logLevel,msg);
        }
    }
}

package javaWeek5;

/* 3.Create two classes that implement the Logger interface
    a.AsteriskLogger
    b.SpacedLogger
    */

import java.util.Date;

public class AsteriskLogger implements Logger {

    @Override
    public void log(String log) {
        System.out.println("***" + log + "***");
    }

    @Override
    public void error(String error) {
        System.out.println("************************");
        System.out.println("***Error:" + error +"***");
        System.out.println("************************");

    }
}

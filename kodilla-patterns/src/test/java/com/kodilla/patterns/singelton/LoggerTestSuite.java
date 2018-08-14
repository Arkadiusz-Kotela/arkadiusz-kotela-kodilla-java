package com.kodilla.patterns.singelton;


import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog(){
        //Given
        Logger.getInstance().log("log1");
        Logger.getInstance().log("log2");
        Logger.getInstance().log("log3");
        Logger.getInstance().log("log4");
        Logger.getInstance().log("log5");

        //When
        String lastLog = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("log5",lastLog);
    }
}

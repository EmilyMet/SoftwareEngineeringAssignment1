package org.example;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses((JUnitTests.class));

        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println("Unit Tests Successful: " +result.wasSuccessful());
    }
}
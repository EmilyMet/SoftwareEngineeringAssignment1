package org.example;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * This class runs the main method.
 * The main method runs the JUnitTest class and prints if the tests are a success or failure.
 */
public class Main {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses((JUnitTests.class));

        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println("Unit Tests Successful: " +result.wasSuccessful());
    }
}
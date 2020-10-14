package com.orangebook;

public class App {
    public static void main(String[] args) {
        TestRunner testRunner = new TestRunner();
        Class<?>[] classes = new Class[] {CalculatorTest.class};
        testRunner.runTests(classes);
    }
}

package com.orangebook;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add_whenTwoPlusThree_thenFive() {
        double result = calculator.add(2,3);
        if (result == 5.0) {
            System.out.println("test success");
        } else {
            System.out.println("test failed");
        }

    }

}

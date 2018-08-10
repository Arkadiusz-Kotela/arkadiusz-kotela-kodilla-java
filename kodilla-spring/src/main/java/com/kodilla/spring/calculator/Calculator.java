package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    Display display;

    public double add(int a, int b) {
        double result = a + b;
        display.displayValue(result);
        return result;
    }

    public double sub(int a, int b) {
        double result = a - b;
        display.displayValue(result);
        return result;
    }
    public double mul(int a, int b) {
        double result = a * b;
        display.displayValue(result);
        return result;
    }
    public double div(int a, int b) {
        double result;
        if (b != 0) {
            result = (double) a / b;
        } else {
            throw new ArithmeticException();
        }
        display.displayValue(result);
        return result;
    }


}

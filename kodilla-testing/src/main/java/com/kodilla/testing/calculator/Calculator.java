package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private int getA() {
        return a;
    }

    private int getB() {
        return b;
    }

    public int add() {
        int suma = 0;
        suma = getA() + getB();
        return suma;
    }

    public int substract() {
        int substract = 0;
        substract = getA() - getB();
        return substract;
    }


}

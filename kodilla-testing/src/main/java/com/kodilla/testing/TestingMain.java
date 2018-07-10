package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator(3, 14);

        int sum = calculator.add();

        if (sum == (calculator.getA() + calculator.getB())) {
            System.out.println("add() method test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator1 = new Calculator(34, -54);

        int sub = calculator1.substract();

        if (sub == (calculator1.getA() - calculator1.getB())) {
            System.out.println("substract() method test OK");
        } else {
            System.out.println("Error!");
        }
    }
}

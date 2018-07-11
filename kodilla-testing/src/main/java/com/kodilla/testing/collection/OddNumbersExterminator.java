package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public OddNumbersExterminator() {
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        if (numbers.isEmpty() == true) {
            return null;
        }

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (Integer number : numbers) {

            if (number % 2 == 0) {
                evenNumbers.add(number);
            }

        }

        return evenNumbers;

    }

}

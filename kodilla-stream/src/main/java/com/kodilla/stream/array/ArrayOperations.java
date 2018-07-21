package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    default double getAverage(int[] numbers) {

        IntStream.rangeClosed(1, numbers.length)
                .forEach(System.out::println);

        return IntStream.rangeClosed(1, numbers.length)
                .average().orElse(Double.NaN);

    }
}

package com.kodilla.stream.iterate;

import java.util.stream.Stream;

public final class NumbersGenerator {
    public static void generateEven(int max) {
        Stream.iterate(1, integer -> integer +1)
                .limit(max)
                .filter(integer -> integer % 2 == 0)
                .forEach(System.out::println);
    }
}

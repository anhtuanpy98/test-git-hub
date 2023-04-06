package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03Behaviour {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 6, 2, 8, 10, 13, 4, 2);
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);

        numbers.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);
    }
}

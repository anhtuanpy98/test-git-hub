package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterfaces {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 6, 2, 8, 10, 13, 4, 2);
        List<String> stringList = Arrays.asList("Tuan", "Spring", "Hello");

        Predicate<Integer> integerPredicate = x -> x % 2 == 0;
        Predicate<Integer> integerPredicate2 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 != 0;
            }
        };

        Function<Integer, Integer> integerIntegerFunction = x -> x * x;
        Function<Integer, Integer> integerIntegerFunction2 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*integer;
            }
        };

        Consumer<Integer> println = System.out::println;
        Consumer<Integer> println2 = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        numbers.stream()
                .filter(integerPredicate2)
                .map(integerIntegerFunction2)
                .forEach(println2);
    }
}

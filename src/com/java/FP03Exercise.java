package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;
import java.util.stream.Collectors;

public class FP03Exercise {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 6, 2, 8, 10, 13, 4, 2);
        List<String> stringList = Arrays.asList("Tuan", "Spring", "Hello");

        BinaryOperator<Integer> sum = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };
        numbers.stream()
                .reduce(0, sum);


        //<Input, Output>
        Function<Integer, Integer> integerIntegerFunction = x -> x * x;
        Function<Integer, Integer> integerIntegerFunction2 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*integer*integer;
            }
        };


        List<Integer> newNumbers = mappingAndCreateNewList(numbers, integerIntegerFunction);

        List<Integer> newNumbers2 = mappingAndCreateNewList(numbers, integerIntegerFunction2);

        List<Integer> doubleNumbers = mappingAndCreateNewList(numbers, x -> x+x);
        System.out.println(doubleNumbers);

        //No Input -> Return something
//        Supplier<Integer> randomSomething = () -> 2;
        Supplier<Integer> randomSomething = () -> {
            Random random = new Random();
            return random.nextInt(1000);
        };
        System.out.println(randomSomething.get());
        //UnaryOperator <Output>
        UnaryOperator<Integer> unaryOperator = (x) -> x * 3;
        System.out.println(unaryOperator.apply(100));
        //BiPredicate
        BiPredicate<Integer, String> biPredicate = (number, str) -> {
            return number < 10 && str.length()>5;
        };
        System.out.println(biPredicate.test(2,"tuananh"));

        //BiFunction
        // <Input, Input, Output>
        BiFunction<Integer, String, String> biFunction = (number, str) -> {
            return number + "  " + str;
        };
        System.out.println(biFunction.apply(5, "tuan"));

        //BiConsumer
        BiConsumer<Integer, String> biConsumer = (s1, s2) -> {
            System.out.println(s1);
            System.out.println(s2);
        };
        biConsumer.accept(12, "Anh");

        //Primiti
        BinaryOperator<Integer> sumBinaryOperator = (x,y) -> x+y;
        IntBinaryOperator intBinaryOperator = (x,y) -> x+ y;
        System.out.println(intBinaryOperator.applyAsInt(5,0));
        IntToDoubleFunction intToDoubleFunction = x -> x;
        Double double1 = intToDoubleFunction.applyAsDouble(6);
        System.out.println(double1);
    }

    private static List<Integer> mappingAndCreateNewList(List<Integer> numbers, Function<Integer, Integer> integerIntegerFunction) {
        return numbers.stream()
                .map(integerIntegerFunction)
                .collect(Collectors.toList());
    }
}

package com.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 6, 2, 8, 10, 13, 4, 2);
        List<String> stringList = Arrays.asList("Tuan", "Spring", "Hello");
        stringList.stream().sorted(Comparator.comparing(string -> string.length())).forEach(System.out::println);
//        int sum = addListStructured(numbers);
//        System.out.println(sum);
//        numbers.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//        numbers.stream().distinct().sorted(Comparator.comparing(number -> 10)).forEach(System.out::println);
        List<Integer> doubleNumbers = doubleList(numbers);
        doubleNumbers.stream().forEach(System.out::println);
    }

    private static List<Integer> doubleList(List<Integer> numbers) {
        return numbers.stream().map(number -> number * number).collect(Collectors.toList());
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int addListStructured(List<Integer> numbers) {
//        return numbers.stream().reduce(0, FP02Functional::sum);
//        return numbers.stream().reduce(0, (x,y) -> x+ y);
        return numbers.stream().reduce(0, Integer::sum);
    }
}

package com.java;

import java.util.Arrays;
import java.util.List;

public class FP01Exercise {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 4, 5, 6, 7, 8);
        printOddNumbersInListStructured(numbers);
        List<String> stringList = Arrays.asList("Spring", "Jaa", "Spring Boot", "Kuberneties");
//        stringList.stream().forEach(System.out::println);
//        stringList.stream()
//                .filter(string -> string.contains("Spring"))
//                .forEach(System.out::println);
//        stringList.stream()
//                .filter(string -> string.length()>=4)
//                .forEach(System.out::println);
        stringList.stream()
                .map(string -> "course ".concat(string))
                .forEach(System.out::println);
        stringList.stream().map(string -> string + " " + string.length());
    }

    private static void printOddNumbersInListStructured(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 != 0) // lamda expression
                .forEach(System.out::println);
    }
}

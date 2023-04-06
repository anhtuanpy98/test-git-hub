package com.java;

import java.util.Arrays;
import java.util.List;

public class JavaStreamFunctional {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,4,5,6,7,8);
//        printAllNumbersInListStructured(numbers);
//        printEvenNumbersInListStructured(numbers);
        printSquareNumbersInListStructured(numbers);
    }

    private static void printAllNumbersInListStructured(List<Integer> list) {

//        for(Integer i : list){
//            System.out.println(i);
//        }
//        list.stream().forEach(JavaStream::print);
    }

    private static boolean isEven(int number){
        return number%2==0;
    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        numbers.stream()
//                .filter(JavaStreamFunctional::isEven)
                .filter(number -> number%2==0) // lamda expression
                .forEach(System.out::println);
    }

    private static void printSquareNumbersInListStructured(List<Integer> numbers) {
        numbers.stream()
                .map(number -> number*number)
                .forEach(System.out::println);
    }
}

package com.java;

import java.util.Arrays;
import java.util.List;

public class JavaStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,4,5,6,7,8);
//        printAllNumbersInListStructured(numbers);
        printEvenNumbersInListStructured(numbers);
    }

//    public static void print(int i){
//        System.out.println(i);
//    }

    private static void printAllNumbersInListStructured(List<Integer> list) {

//        for(Integer i : list){
//            System.out.println(i);
//        }
//        list.stream().forEach(JavaStream::print);
        list.stream().forEach(System.out::println);
    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        for(int number : numbers){
            if(number%2==0){
                System.out.println(number);
            }
        }
    }
}

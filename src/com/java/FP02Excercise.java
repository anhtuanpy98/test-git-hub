package com.java;

import java.util.Arrays;
import java.util.List;

public class FP02Excercise {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,6,2,8,10,13);
        int sum = addListStructured(numbers);
        System.out.println(sum);
    }

    private static int sum(int a, int b){
        return a+b;
    }

    private static int addListStructured(List<Integer> numbers) {
//        return numbers.stream().reduce(0, FP02Functional::sum);
//        return numbers.stream().reduce(0, (x,y) -> x+ y);
//        return numbers.stream().map(x -> x*x).reduce(0, Integer::sum);
        return numbers.stream().filter(x -> x%2==1).reduce(0, Integer::sum);
    }
}

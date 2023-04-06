package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Supplier;

public class FP03MethodReferences {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 6, 2, 8, 10, 13, 4, 2);
        List<String> stringList = Arrays.asList("Tuan", "Spring", "Spring Boot", "Kuberneties");
        stringList.stream()
//                .map(str -> str.toUpperCase(Locale.ROOT))
                .map(String::toUpperCase)
                .forEach(System.out::println);

//        Supplier<String> supplier = () -> new String();
        Supplier<String> supplier = String::new;

    }
}

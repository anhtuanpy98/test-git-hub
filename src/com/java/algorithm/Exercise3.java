package com.java.algorithm;

import java.util.Collections;

public class Exercise3 {
    public static int missingNumber(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
        if (arr[0] != 1) {
            return 1;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 != arr[i + 1]) {
                return arr[i] + 1;
            }
        }
        return arr[arr.length - 1] + 1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 3};
        System.out.println(missingNumber(arr));
    }
}

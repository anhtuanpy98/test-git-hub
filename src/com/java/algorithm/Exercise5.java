package com.java.algorithm;

public class Exercise5 {
    public static int solve(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {12,1,2,14,96,97,27,33,70,21};
        System.out.println(solve(arr));
    }
}

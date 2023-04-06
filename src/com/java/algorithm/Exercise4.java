package com.java.algorithm;

public class Exercise4 {
    public static boolean duplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean duplicate2(int[] arr) {
        String stringNumber = "";
        for (int i = 0; i < arr.length; i++) {
            char number = (char) (arr[i] + '0');;
            System.out.println(number);
            stringNumber += String.valueOf(number);
        }
        System.out.println(stringNumber);
        for (int i = 0; i < stringNumber.length(); i++) {
            char number = stringNumber.charAt(i);
            if (stringNumber.indexOf(number) != stringNumber.lastIndexOf(number)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 3, 2};
        System.out.println(duplicate(arr));
        System.out.println(duplicate2(arr));
    }
}

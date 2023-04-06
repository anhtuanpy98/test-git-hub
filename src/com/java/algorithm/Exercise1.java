package com.java.algorithm;

public class Exercise1 {
    public static int groupedBits(int n) {
        if (n == 0) {
            return 0;
        }
        int count = 0;

        int numberA = n;
        String numberBit = "";
        while (numberA > 0) {
            int numberB = numberA % 2;
            char surplus = (char) (numberB + '0');
            numberBit = String.valueOf(surplus) + numberBit;
            numberA = numberA / 2;
        }

        System.out.println("Number Bit: " + numberBit);
        char firstChar = numberBit.charAt(0);
        if (firstChar == '1') {
            count++;
        }
        boolean flag = true;
        for (int i = 1; i < numberBit.length(); i++) {
            char c = numberBit.charAt(i);
            if (c == '0') {

            } else {
                if (firstChar == '1' && flag == true && i == 1) {
                    count--;
                    flag = false;
                }
                count++;
                i++;
                while (c == '1' && i < numberBit.length()) {
                    c = numberBit.charAt(i);
                    i++;
                }
                i--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(groupedBits(1000000000));
    }
}

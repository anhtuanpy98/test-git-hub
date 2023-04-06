package com.java.algorithm;

public class Exercise2 {
    public static String electronicScreen(String s) {
        String result = "";
        int length = s.length();
        int numberArray = length / 8;
        String[] array = new String[numberArray];
        for (int i = 0; i < numberArray; i++) {
            if (i == 0) {
                array[i] = s.substring(0, 8);
            } else {
                array[i] = s.substring(i * 8, (i + 1) * 8);
            }
        }

        for (int i = 0; i < numberArray; i++) {
            switch (array[i]) {
                case "01011111":
                    result += "0";
                    break;
                case "00000101":
                    result += "1";
                    break;
                case "01110110":
                    result += "2";
                    break;
                case "01110101":
                    result += "3";
                    break;
                case "00101101":
                    result += "4";
                    break;
                case "01111001":
                    result += "5";
                    break;
                case "01111011":
                    result += "6";
                    break;
                case "01000101":
                    result += "7";
                    break;
                case "01111111":
                    result += "8";
                    break;
                case "01111101":
                    result += "9";
                    break;
                default:
                    break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(electronicScreen("011110110100010101111111"));
    }
}

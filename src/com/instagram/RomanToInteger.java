package com.instagram;

public class RomanToInteger {
    public static void main(String[] args) {
        String str = "MCMXCIV";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && getValue(str.charAt(i))
                    < getValue(str.charAt(i + 1))) {
                sum -= getValue(str.charAt(i));
            } else {
                sum += getValue(str.charAt(i));
            }
        }
        System.out.println(sum);
    }

    private static int getValue(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> -1;
        };
    }
}



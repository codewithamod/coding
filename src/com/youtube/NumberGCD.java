package com.youtube;

public class NumberGCD {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        System.out.println(gcd(12, 18));
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

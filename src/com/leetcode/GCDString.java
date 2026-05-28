package com.leetcode;

public class GCDString {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";

        if (!(str1 + str2).equals(str2 + str1)) {
            System.out.println(false);
            System.exit(0);
        }

        int value = gcd(str1.length(), str2.length());

        System.out.println(str1.substring(0, value));

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

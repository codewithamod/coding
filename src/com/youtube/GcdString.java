package com.youtube;

public class GcdString {
    public static void main(String[] args) {
        String s1 = "ABCABC";
        String s2 = "ABC";
        System.out.println(gcd(s1, s2));

    }

    private static String gcd(String s1, String s2) {
        if (!s1.concat(s2).equals(s2.concat(s1))) {
            return "";
        }
        int gcd = gcd(s1.length(), s2.length());
        return s1.substring(0, gcd);
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

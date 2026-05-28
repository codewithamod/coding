package com.java8;

public class Solution {
    public static void main(String[] args) {

        String str = "hello world";
        String[] s = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            String value = reverse(s[i]);
            sb.append(value);
        }
        System.out.println(String.valueOf(sb));

    }

    private static String reverse(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }

}

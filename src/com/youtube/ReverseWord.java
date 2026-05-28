package com.youtube;

public class ReverseWord {
    public static void main(String[] args) {

        String str = "a";
        String[] s = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = s.length - 1; i >= 0; i--) {
            sb.append(s[i]);
            sb.append(" ");
        }

        System.out.println(String.valueOf(sb).trim());

    }
}

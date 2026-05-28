package com.leetcode;

public class StringCompression {
    public static void main(String[] args) {

        char[] c = {'a', 'a', 'b', 'b', 'b', 'c'};
        //a2b3c
        StringBuilder sb = new StringBuilder();
        int index = 0; // write
        int count = 1;
        char first = c[0];
        for (int i = 1; i < c.length; i++) {
            char current = c[i];

            if (current == first) {
                count++;
            } else {
                sb.append(first);
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
                first = current;
            }

        }
        sb.append(first);
        if (count > 1) {
            sb.append(count);
        }
        System.out.println(sb.toString());
    }
}

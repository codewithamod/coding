package com.leetcode;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "abcabcda";
        System.out.println(longestSubString(str));
    }

    private static String longestSubString(String str) {
        Set<Character> set = new LinkedHashSet<>();

        int left = 0;
        int right = 0;

        int max = Integer.MIN_VALUE;
        int start = 0;

        while (right < str.length()) {
            char current = str.charAt(right);
            if (set.contains(current)) {
                set.remove(str.charAt(left++));
            }

            set.add(current);

            if (right - left + 1 > max) {
                max = right - left + 1;
                start = left;
            }

            right++;
        }

        return str.substring(start, start + max);

    }
}

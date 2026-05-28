package com.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class SubstringWithAllValue {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }

    private static String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int count = t.length();

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        int start = 0;

        while (j < s.length()) {
            char right = s.charAt(j);
            if (map.containsKey(right)) {
                map.put(right, map.get(right) - 1);
                if (map.get(right) >= 0) {
                    count--;
                }
            }

            while (count == 0) {

                if (min > j - i + 1) {
                    min = j - i + 1;
                    start = i;
                }

                char left = s.charAt(i);
                if (map.containsKey(left)) {
                    map.put(left, map.get(left) + 1);
                    if (map.get(left) > 0) {
                        count++;
                    }
                }
                i++;
            }

            j++;
        }

        return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);

    }
}

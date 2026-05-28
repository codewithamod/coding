package com.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat cat";
        System.out.println(wordPattern(pattern, s));
    }

    private static boolean wordPattern(String pattern, String s) {
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char key = pattern.charAt(i);
            String word = words[i];
            if (map1.containsKey(key)) {
                if (!map1.get(key).equals(word)) {
                    return false;
                }
            } else {
                map1.put(key, word);
            }

            if (map2.containsKey(word)) {
                if (map2.get(word) != key) {
                    return false;
                }
            } else {
                map2.put(word, key);
            }
        }
        return true;
    }
}

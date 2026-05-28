package com.leetcode;

import java.util.*;

class CloseStrings {

    public static void main(String[] args) {
        String word1 = "uau";
        String word2 = "ssx";
        System.out.println(closeStrings(word1, word2));

    }

    public static boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : word2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        if(!map1.keySet().equals(map2.keySet())){
            return false;
        }

        List<Integer> lst1 = new ArrayList<>(map1.values());
        List<Integer> lst2 = new ArrayList<>(map2.values());
        Collections.sort(lst1);
        Collections.sort(lst2);

        return lst1.equals(lst2);
    }
}




















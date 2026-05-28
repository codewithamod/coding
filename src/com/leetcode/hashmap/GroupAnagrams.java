package com.leetcode.hashmap;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(str));
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if (map.containsKey(key)) {
                List<String> list = map.get(key);
                list.add(str);
                map.put(key, list);
            } else {
                List<String> lst = new ArrayList<>();
                lst.add(str);
                map.put(key, lst);
            }
        }

        return map.entrySet().stream().map(Map.Entry::getValue).toList();

    }
}

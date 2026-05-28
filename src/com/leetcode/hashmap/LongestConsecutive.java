package com.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] ar = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(ar));
    }

    private static int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int a : nums) {
            map.put(a, true);
        }

        for (int a : nums) {
            if (map.containsKey(a - 1)) {
                map.put(a, false);
            }
        }

        int max = 1;

        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            int current = 1;
            if (entry.getValue()) {
                int value = entry.getKey() + 1;
                while (map.containsKey(value)) {
                    current++;
                    value++;
                }
            }
            max = Math.max(current, max);
        }

        return 0;

    }
}

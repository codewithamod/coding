package com.instagram;

import java.util.HashSet;
import java.util.Set;

public class Max {
    public static void main(String[] args) {
        int[] arr = {-1,2,-3,3};
        System.out.println(findMaxK(arr));
    }

    private static int findMaxK(int[] nums) {

        int max = -1;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int num : nums) {
            if (num > max && set.contains(-num)) {
                max = num;
            }
        }

        return max;
    }
}
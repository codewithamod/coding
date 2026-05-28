package com.geeks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindMissingNumber {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int[] arr = {1, 2, 5, 6, 7, 9};
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        for (int a : arr) {
            set.add(a);
        }

        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                System.out.print(i + " ");
            }
        }

    }
}

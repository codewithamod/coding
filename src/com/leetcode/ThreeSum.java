package com.leetcode;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        int target = 0;
        System.out.println(threeSum(arr, target));
    }

    private static List<List<Integer>> threeSum(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = arr.length - 1;
            int newTarget = target - arr[i];
            while (j < k) {
                if (arr[j] + arr[k] == newTarget) {
                    List<Integer> lst = List.of(arr[i], arr[j], arr[k]);
                    result.add(lst);

                    j++;
                    k--;

                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }

                    while (j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }

                } else if (arr[j] + arr[k] > newTarget) {
                    k--;
                } else {
                    j++;
                }
            }

        }

        return result;


    }
}

package com.geeks;

import java.util.Arrays;

public class FindTriplets {
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        System.out.println(findTriplets(arr));
    }

    public static boolean findTriplets(int[] arr) {
        int target = 0;
        Arrays.sort(arr);
        ;
        for (int i = 0; i < arr.length - 2; i++) {
            int newTarget = target - arr[i];
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                if (arr[left] + arr[right] == newTarget) {
                    System.out.println(
                            "Triplet found: " +
                                    arr[i] + ", " +
                                    arr[left] + ", " +
                                    arr[right]
                    );
                    return true;
                } else if (arr[left] + arr[right] > newTarget) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return false;
    }
}

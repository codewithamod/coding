package com.leetcode.binarysearch;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 4, 5, 5};
        findFirstAndLast(arr);
    }

    private static void findFirstAndLast(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int first = -1;
        int target = 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        left = 0;
        right = arr.length - 1;
        int second = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                second = mid;
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println("First : " + first);

        System.out.println("Second : " + second);
    }
}

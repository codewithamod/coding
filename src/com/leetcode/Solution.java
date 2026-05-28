package com.leetcode;

public class Solution {

    public static void main(String[] args) {

        int[] arr = {4, 5, 1, 2, 3};
        int target = 3;

        System.out.println("At index " + search(arr, target));

    }

    private static int search(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            // check if left side is sorted or not

            if (arr[left] <= arr[mid]) {
                if (arr[left] <= target && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (arr[mid] <= target && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }


        }
        return -1;

    }
}
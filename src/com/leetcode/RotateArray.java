package com.leetcode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        int[] arr1 = rotateArray(arr, k);

        System.out.println(Arrays.toString(arr1));

    }

    private static int[] rotateArray(int[] arr, int k) {
        rotate(arr, 0, arr.length - 1);
        rotate(arr, 0, k - 1);
        rotate(arr, k, arr.length - 1);
        return arr;
    }

    private static void rotate(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

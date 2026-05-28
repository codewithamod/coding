package com.leetcode.array;

import java.util.Arrays;

public class RotateAnImageBy90Degree {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8,},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        rotateBy90Degree(arr);

        for (int[] val : arr) {
            System.out.println(Arrays.toString(val));
        }

    }

    private static void rotateBy90Degree(int[][] arr) {
        // transponse
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //swap left column with right column
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
            }
            left++;
            right--;
        }

    }
}


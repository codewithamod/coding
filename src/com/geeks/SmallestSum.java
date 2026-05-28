package com.geeks;

public class SmallestSum {
    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 0, 19};
        System.out.println(smallestSubWithSum(51, arr));

    }

    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here

        int sum = 0;

        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        while (j < arr.length) {
            sum = sum + arr[j];
            while (sum > x) {
                min = Math.min(min, j - i + 1);
                sum = sum - arr[i];
                i++;
            }
            j++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;

    }
}

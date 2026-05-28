package com.leetcode;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        int majority = majorityElement(arr);
        System.out.println(majority);
    }

    private static int majorityElement(int[] arr) {
        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != candidate) {
                count--;
                if (count == 0) {
                    candidate = arr[i];
                    count = 1;
                }
            } else {
                count++;
            }
        }
        return candidate;
    }
}

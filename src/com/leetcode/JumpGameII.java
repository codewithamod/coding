package com.leetcode;

public class JumpGameII {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 4};
        int jump = jumpGame(arr);
        System.out.println(jump);
    }

    private static int jumpGame(int[] arr) {
        int far = 0;
        int jump = 0;
        int current = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            far = Math.max(far, arr[i] + i);
            if (i == current) {
                jump++;
                current = far;
            }
        }
        return jump;
    }
}

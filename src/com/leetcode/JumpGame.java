package com.leetcode;

public class JumpGame {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 4};
        System.out.println(jumpGame(arr));
    }

    private static boolean jumpGame(int[] arr) {
        int maxJump = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i > maxJump) {
                return false;
            }
            maxJump = Math.max(maxJump, arr[i] + i);
        }
        return true;
    }
}

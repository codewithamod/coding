package com.leetcode.SlidingWindow;

public class MinSizeSubArraySum {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(target, nums));
    }

    private static int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int i = 0;
        int j = 0;
        int size = Integer.MAX_VALUE;
        while (j < nums.length) {
            sum += nums[j];
            while (sum >= target) {
                sum -= nums[i];
                size = Math.min(size, j - i + 1);
                i++;
            }
            j++;
        }
        return size;
    }
}

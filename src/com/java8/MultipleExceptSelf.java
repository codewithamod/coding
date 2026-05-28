package com.java8;

import java.util.Arrays;

public class MultipleExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] ans = multiple(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] multiple(int[] arr) {
        int n = arr.length;

        int[] ans = new int[n];
        ans[0] = 1;
        // left
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * arr[i - 1];
        }

        int right = 1;

        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * right;
            right = right * arr[i];
        }

        return ans;
    }
}

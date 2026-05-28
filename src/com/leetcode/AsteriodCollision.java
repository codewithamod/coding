package com.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class AsteriodCollision {
    public static void main(String[] args) {
        int[] asteriod = {10, 5, -8};
        int[] ints = asteroidCollision(asteriod);
        System.out.println(Arrays.toString(ints));
    }

    private static int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();
        boolean destroyed = false;
        for (int a : asteroids) {

            while (!stack.isEmpty() && stack.peek() > 0 && a < 0) {
                int top = stack.peek();
                if (top < -a) {
                    stack.pop();
                    continue;
                } else if (top == -a) {
                    stack.pop();
                }

                destroyed = true;
                break;
            }

            if (!destroyed) {
                stack.push(a);
            }


        }

        int[] arr = new int[stack.size()];
        int i = 0;
        for (int a : stack) {
            arr[i++] = a;
        }

        return arr;

    }
}
















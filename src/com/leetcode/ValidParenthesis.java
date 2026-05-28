package com.leetcode;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "(]";
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : ch) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    System.out.println(false);
                    System.exit(0);
                }

                char top = stack.peek();

                if ((c == ')' && top == '(')
                        || (c == ']' && top == '[')
                        || (c == '}' && top == '{')) {
                    stack.pop();
                } else {
                    System.out.println(false);
                    System.exit(0);
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

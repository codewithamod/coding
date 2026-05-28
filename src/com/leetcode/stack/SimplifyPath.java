package com.leetcode.stack;

import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        String path = "/home/";
        System.out.println(solution(path));
    }

    private static String solution(String path) {
        Stack<String> stack = new Stack<>();
        String[] str = path.split("/");
        for (String s : str) {
            if (s.equals(".") || s.equals("")) {
                continue;
            }
            if (s.equals("..") && !stack.isEmpty()) {
                stack.pop();
            } else if (!s.equals("..")) {
                stack.push(s);
            }

        }
        StringBuilder sb = new StringBuilder();
        for (String sr : stack) {
            sb.append("/");
            sb.append(sr);
        }
        return stack.isEmpty() ? "/" : sb.toString();
    }
}

package com.youtube;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(str));
    }

    private static String longestCommonPrefix(String[] str) {
        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            String value = str[i];
            while (!value.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}

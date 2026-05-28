package com.scalar;

public class SmallestNumber {
    public static void main(String[] args) {
        int num = 100;
        System.out.println(solution(num));
    }

    private static int solution(int num) {

        String str = "";
        for (int i = 9; i >= 2; i--) {
            while (num % i == 0) {
                num = num / i;
                str = i + str;
            }
        }

        if (num != 1) {
            return -1;
        } else {
            return Integer.parseInt(str);
        }

    }
}

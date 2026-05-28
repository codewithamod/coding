package com.leetcode.thread;

public class ThreadDemo {
    static int count = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                count++;
            }
        });
        t1.start();
    }

}

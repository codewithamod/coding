package com.java8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i <= 5; i++) {
            int task = i;
            executorService.submit(() -> {
                print(task);
            });
        }
        executorService.shutdown();
    }

    private static void print(int i) {
        System.out.println(Thread.currentThread().getName() + " : " + i);
    }
}

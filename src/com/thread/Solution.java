package com.thread;

public class Solution {
    public static void main(String[] args) {
        SharedQueue sharedQueue = new SharedQueue(5);
        Thread producer = new Thread(new Producer(sharedQueue), "Producer");
        Thread consumer = new Thread(new Consumer(sharedQueue), "Consumer");

        producer.start();
        consumer.start();
    }
}

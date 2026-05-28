package com.practice.producer_consumer;

public class Solution {
    public static void main(String[] args) {
        SharedQueue queue = new SharedQueue(5);
        Thread producer = new Thread(new Producer(queue),"Producer");
        Thread consumer = new Thread(new Consumer(queue),"Consumer");

        producer.start();
        consumer.start();
    }
}

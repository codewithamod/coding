package com.practice.producer_consumer;

import java.util.LinkedList;
import java.util.Queue;

public class SharedQueue {

    private final Queue<Integer> queue = new LinkedList<>();

    private final int capacity;

    public SharedQueue(int capacity) {
        this.capacity = capacity;
    }

    public void produce(int value) throws InterruptedException {
        synchronized (this) {
            while (queue.size() == capacity) {
                System.out.println("Queue is full");
                wait();
            }
            queue.add(value);
            System.out.println("Produces: " + value);
            notify();
        }
    }

    public void consume() throws InterruptedException {
        synchronized (this) {
            while (queue.isEmpty()) {
                System.out.println("Queue is empty");
                wait();
            }
            Integer peek = queue.peek();
            System.out.println("Consumed: "+peek);
            queue.poll();
            notify();
        }
    }

}

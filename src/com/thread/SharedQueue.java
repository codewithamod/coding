package com.thread;

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
            // wait if queue is full
            while (queue.size() == capacity) {
                System.out.println("Queue full, producer waiting");
                wait();
            }
            queue.add(value);
            notify();
        }
    }

    public void consumer() throws InterruptedException {
        synchronized (this) {
            while (queue.isEmpty()) {
                System.out.println("Consumer waiting");
                wait();
            }
            int value = queue.poll();
            System.out.println("Consumed " + value);
        }
    }

}

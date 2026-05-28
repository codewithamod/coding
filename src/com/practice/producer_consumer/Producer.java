package com.practice.producer_consumer;

public class Producer implements Runnable {

    private final SharedQueue queue;

    public Producer(SharedQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int value = 0;
        while (true) {
            try {
                queue.produce(value++);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

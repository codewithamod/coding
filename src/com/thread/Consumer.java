package com.thread;

public class Consumer implements Runnable {
    private final SharedQueue queue;

    public Consumer(SharedQueue queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        while (true) {
            try {
                queue.consumer();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

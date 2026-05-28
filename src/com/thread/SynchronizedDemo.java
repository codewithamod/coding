package com.thread;

public class SynchronizedDemo {
    public static void main(String[] args) {

        PrintNumberTest pt1 = new PrintNumberTest();
        PrintNumberTest pt2 = new PrintNumberTest();

        Thread t1 = new Thread(() -> PrintNumberTest.printNumber(), "T1");
        Thread t2 = new Thread(() -> PrintNumberTest.printNumber(), "T2");
        t1.start();
        t2.start();
    }
}

class PrintNumberTest {

    public static synchronized void printNumber() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

}

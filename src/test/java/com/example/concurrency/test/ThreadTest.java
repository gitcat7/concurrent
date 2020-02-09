package com.example.concurrency.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadTest {

    static Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            log.info("t1");
        }
    });

    static Thread t2 = new Thread(new Runnable() {
        @Override
        public void run() {
            log.info("t2");
        }
    });

    static Thread t3 = new Thread(new Runnable() {
        @Override
        public void run() {
            log.info("t3");
        }
    });

    public static void main(String[] args) throws InterruptedException {
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}

package com.example.concurrency.test;
import	java.util.concurrent.TimeUnit;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class TestInterrupt1 {

    public static void main(String[] args) throws InterruptedException {
        test2();
    }

    private static void test2() throws InterruptedException {
        Thread t = new Thread(() -> {
            log.debug("sleep.....");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "t");
        t.start();
        TimeUnit.SECONDS.sleep(2);
        log.debug("interrupt");
        t.interrupt();
        log.debug("打断标记: {}", t.isInterrupted());
    }
}

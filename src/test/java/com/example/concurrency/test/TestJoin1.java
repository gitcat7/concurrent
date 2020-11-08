package com.example.concurrency.test;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class TestJoin1 {

    private static int a = 0;

    public static void main(String[] args) throws InterruptedException {
        test1();
    }

    private static void test1() throws InterruptedException {
        log.debug("开始");
        Thread t1 = new Thread(() -> {
            log.debug("开始");
            try {
                TimeUnit.SECONDS.sleep(1);
                log.debug("结束");
                a = 10;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "t1");
        t1.start();
        t1.join();
        log.debug("结果a为:{}", a);
    }
}

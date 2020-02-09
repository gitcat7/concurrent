package com.example.concurrency.example.aqs;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

@Slf4j
public class FutureTaskExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        FutureTask<Integer> stringFutureTask = new FutureTask<>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int a = 1;
                log.info("do something in callable");
                Thread.sleep(5000);
                return a;
            }
        });
        new Thread(stringFutureTask).start();
        log.info("do something in main");
        Thread.sleep(1000);
        Integer integer = stringFutureTask.get();
        log.info("{}", integer);
    }
}

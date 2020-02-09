package com.example.concurrency.example.aqs;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

@Slf4j
public class FutureExample {

    static class MyCallable implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            int a = 1;
            log.info("do something in callable");
            Thread.sleep(5000);
            return a;
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> future = executorService.submit(new MyCallable());
        log.info("do something in main");
        Thread.sleep(1000);
        Integer integer = future.get();
        log.info("{}", integer);
    }
}

package com.example.concurrency.example.threadPool;

import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Slf4j
public class ThreadPoolExample4 {

    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
        log.info("-----------");
//        executorService.schedule(new Runnable() {
//            @Override
//            public void run() {
//                log.warn("schedule1 run");
//            }
//        }, 3000, TimeUnit.MILLISECONDS);
//        executorService.scheduleAtFixedRate(new Runnable() {
//            @Override
//            public void run() {
//                log.warn("schedule2 run");
//            }
//        }, 5000, 3000, TimeUnit.MILLISECONDS);//延迟5s,每3s执行一次
//        executorService.shutdown();

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                log.warn("timer run");
            }
        }, new Date(), 3*1000);
    }
}
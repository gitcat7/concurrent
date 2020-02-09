package com.example.concurrency.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test{


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Test1 test1 = new Test1();
        FutureTask<Integer> task = new FutureTask<Integer>(test1);

        new Thread(task).start();
        Integer i = task.get();
        System.out.println(i);
    }
}

class Test1 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int a = 1;
        return a;
    }
}

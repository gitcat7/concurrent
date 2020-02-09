package com.example.concurrency.example.singleton;

import com.example.concurrency.annoations.NotThreadSafe;
import com.example.concurrency.annoations.ThreadSafe;

@ThreadSafe
public class SingletonExample2 {

    private SingletonExample2() {
    }

    private static SingletonExample2 instance = new SingletonExample2();

    public static SingletonExample2 getInstance(){
        return instance;
    }
}

package com.example.concurrency.example.singleton;

import com.example.concurrency.annoations.NotThreadSafe;
import com.example.concurrency.annoations.ThreadSafe;

@ThreadSafe
public class SingletonExample6 {

    private SingletonExample6() {
    }

    static {
        instance = new SingletonExample6();
    }

    private static SingletonExample6 instance = null;

    public static SingletonExample6 getInstance(){
        return instance;
    }
}

package com.example.concurrency.example.singleton;

import com.example.concurrency.annoations.NotThreadSafe;

@NotThreadSafe
public class SingletonExample1 {

    private SingletonExample1() {
    }

    private static SingletonExample1 instance = null;

    public static SingletonExample1 getInstance(){
        if(null == instance){
            instance = new SingletonExample1();
        }
        return instance;
    }
}

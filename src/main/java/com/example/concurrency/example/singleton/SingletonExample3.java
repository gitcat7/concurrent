package com.example.concurrency.example.singleton;

import com.example.concurrency.annoations.NotThreadSafe;
import com.example.concurrency.annoations.ThreadSafe;

@ThreadSafe
public class SingletonExample3 {

    private SingletonExample3() {
    }

    private static SingletonExample3 instance = null;

    //线程安全,但是不推荐
    public synchronized static SingletonExample3 getInstance(){
        if(null == instance){
            instance = new SingletonExample3();
        }
        return instance;
    }
}

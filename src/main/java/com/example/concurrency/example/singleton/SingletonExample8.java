package com.example.concurrency.example.singleton;

import com.example.concurrency.annoations.Recommend;
import com.example.concurrency.annoations.ThreadSafe;

/**
 * 枚举模式,最安全
 */
@ThreadSafe
@Recommend
public class SingletonExample8 {
    private SingletonExample8() {
    }

    public static SingletonExample8 getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton{
        INSTANCE;

        private SingletonExample8 instance;

        Singleton() {
            instance = new SingletonExample8();
        }

        public SingletonExample8 getInstance(){
            return instance;
        }
    }
}

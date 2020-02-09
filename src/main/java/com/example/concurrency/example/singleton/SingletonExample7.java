package com.example.concurrency.example.singleton;

import com.example.concurrency.annoations.Recommend;
import com.example.concurrency.annoations.ThreadSafe;

/**
 * 枚举模式,最安全
 */
@ThreadSafe
@Recommend
public class SingletonExample7 {

    private SingletonExample7() {
    }

    public static SingletonExample7 getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton{
        INSTANCE;

        private SingletonExample7 Singleton;

        //构造器,JVM保证这个方法绝对只调用一次
        Singleton(){
            Singleton = new SingletonExample7();
        }

        public SingletonExample7 getInstance(){
            return Singleton;
        }
    }
}

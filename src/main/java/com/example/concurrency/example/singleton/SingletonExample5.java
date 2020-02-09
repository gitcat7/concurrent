package com.example.concurrency.example.singleton;

import com.example.concurrency.annoations.NotThreadSafe;

/**
 * 双重同步锁单例模式,不一定线程安全,因为可能有指令重排,使用volatile解决线程不安全
 */
@NotThreadSafe
public class SingletonExample5 {

    private SingletonExample5() {
    }

    //1.memory = allocate() 分配对象的内存空间
    //2.ctorInstance()初始化对象
    //3.instance = memory设置instance指向刚分配的空间

    //JVM和CPU优化,发生了指令重拍,前者顺序发生改变1,3,2

    //volatile+双重检测机制 -> 禁止指令重排
    private volatile static SingletonExample5 instance = null;

    public static SingletonExample5 getInstance(){
        if(null == instance){//双重检测机制
            synchronized (SingletonExample5.class){//同步锁
                if(null == instance){
                    instance = new SingletonExample5();
                }
            }
        }
        return instance;
    }
}

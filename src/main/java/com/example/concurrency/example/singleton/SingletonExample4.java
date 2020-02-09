package com.example.concurrency.example.singleton;

import com.example.concurrency.annoations.NotThreadSafe;
import com.example.concurrency.annoations.ThreadSafe;

/**
 * 双重同步锁单例模式,不一定线程安全,因为可能有指令重排
 */
@NotThreadSafe
public class SingletonExample4 {

    private SingletonExample4() {
    }

    //1.memory = allocate() 分配对象的内存空间
    //2.ctorInstance()初始化对象
    //3.instance = memory设置instance指向刚分配的空间

    //JVM和CPU优化,发生了指令重拍,前者顺序发生改变1,3,2

    private static SingletonExample4 instance = null;

    public static SingletonExample4 getInstance(){
        if(null == instance){//双重检测机制
            synchronized (SingletonExample4.class){//同步锁
                if(null == instance){
                    instance = new SingletonExample4();
                }
            }
        }
        return instance;
    }
}

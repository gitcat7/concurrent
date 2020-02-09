package com.example.concurrency.example.syncContainer;

import com.example.concurrency.annoations.NotThreadSafe;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.compat.JreVendor;

import java.util.Iterator;
import java.util.Vector;

@Slf4j
@NotThreadSafe
public class VectorExample3 {

    public static void test1(Vector<Integer> vector){
        for (Integer integer : vector) {
            if(integer.equals(3)){
                vector.remove(integer);
            }
        }
    }
    public static void test2(Vector<Integer> vector){
        Iterator<Integer> iterator = vector.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            if(next.equals(3)){
                vector.remove(next);
            }
        }
    }

    //成功
    public static void test3(Vector<Integer> vector){
        for (int i = 0; i < vector.size(); i++) {
            if(vector.get(i).equals(3)){
                vector.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        test1(vector);
    }
}

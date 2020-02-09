package com.example.concurrency.example.immutable;

import com.example.concurrency.annoations.ThreadSafe;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import sun.security.timestamp.TimestampToken;

import java.util.Collections;
import java.util.Map;

/**
 * Collections.unmodifiableXXX:不可变对象,引用值也不能修改
 */
@Slf4j
@ThreadSafe
public class ImmutableExample3 {

    private final static ImmutableList<Integer> list = ImmutableList.of(1, 2, 3);

    private final static ImmutableSet<Integer> set = ImmutableSet.copyOf(list);

    private final static ImmutableMap<Integer, Integer> map = ImmutableMap.of(1, 2, 3, 4);

    private final static ImmutableMap<Object, Object> map2 = ImmutableMap.builder().put(1, 2).put(3, 4).build();

    public static void main(String[] args) {
        set.add(4);
    }
}

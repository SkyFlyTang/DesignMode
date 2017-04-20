package com.pb.design.mode.test.singlemode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by skytang on 2017/4/19.
 */

public class SingleTest {
    private SingleTest() {
    }

    private static SingleTest single = null;


    //（1）懒汉式（线程不安全）
    //暴露的公有静态方法
    public static SingleTest getInstance1() {
        if (single == null) {
            single = new SingleTest();
        }
        return single;
    }

    //（2）懒汉式（线程安全）
    public static synchronized SingleTest getInstance2() {
        if (single == null) {
            single = new SingleTest();
        }
        return single;
    }

    //（3）饿汉模式（线程安全）
    private static SingleTest instance = new SingleTest();
    //其中instance=new Singleton()可以写成：
    /*static {
        instance = new SingleTest();
    }*/

    public static SingleTest getInstance3() {
        return instance;
    }

    //（4）DCL双重校验模式
    public static SingleTest getSingle4() {
        if (single == null) {
            synchronized (SingleTest.class) {
                if (single == null) {
                    single = new SingleTest();
                }
            }
        }
        return single;
    }

    //（5）静态内部类单例模式
    public static SingleTest getSingle5() {
        return SingleHolder.SINGLE_TEST;
    }

    private static class SingleHolder {
        private static final SingleTest SINGLE_TEST = new SingleTest();
    }


    //（7）使用容器实现单例模式
    private static Map<String, SingleTest> stringObjectMap = new HashMap<>();
    private static final String KEY = "key";

    public static SingleTest getSingle7() {
        SingleTest single = stringObjectMap.get(KEY);
        if (single == null) {
            single = new SingleTest();
            stringObjectMap.put(KEY, single);
        }
        return single;

    }


}

package com.pb.design.mode.test.singlemode;

import android.util.Log;

/**
 * Created by skytang on 2017/4/20.
 */
//（6）枚举单例
public enum Singleton {
    INSTANCE;

    private Singleton() {

    }

    public void testString() {
        Log.i("skyt", "testString");

    }
}

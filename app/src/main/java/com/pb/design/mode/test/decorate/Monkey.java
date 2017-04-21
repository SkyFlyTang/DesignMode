package com.pb.design.mode.test.decorate;

import android.util.Log;

/**
 * Created by skytang on 2017/4/21.
 */

public class Monkey implements TheGreatestSage {
    @Override
    public void move() {
        Log.i("skyt", "Monkey is moving");
    }
}

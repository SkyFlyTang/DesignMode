package com.pb.design.mode.test.decorate;

import android.util.Log;

/**
 * Created by skytang on 2017/4/21.
 */

public class Bird extends Change {
    public Bird(TheGreatestSage sage) {
        super(sage);
    }
    @Override
    public void move() {
        Log.i("skyt","Bird Move");
    }

    public void fly() {
        Log.i("skyt","Bird fly");
    }
}

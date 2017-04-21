package com.pb.design.mode.test.decorate;

import android.util.Log;

/**
 * Created by skytang on 2017/4/21.
 */

public class Fish extends Change {
    public Fish(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        Log.i("skyt", "fish is moving");
    }

    public void swim() {
        Log.i("skyt", "fiis can swim");
    }
}

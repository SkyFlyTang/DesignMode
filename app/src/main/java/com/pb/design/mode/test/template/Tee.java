package com.pb.design.mode.test.template;

import android.util.Log;

/**
 * Created by skytang on 2017/4/21.
 */

public class Tee extends Beverage {
    @Override
    void operateWater() {
        Log.i("skyt", "先打热水");
    }

    @Override
    void operateCup() {
        Log.i("skyt", "然后杯子静止");
    }

    @Override
    void operateTemp() {
        Log.i("skyt", "放到火上烤");
    }
}

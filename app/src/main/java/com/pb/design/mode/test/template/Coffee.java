package com.pb.design.mode.test.template;

import android.util.Log;

/**
 * Created by skytang on 2017/4/21.
 */

public class Coffee extends Beverage {
    @Override
    void operateWater() {
        Log.i("skyt", "先打冷水");
    }

    @Override
    void operateCup() {
        Log.i("skyt", "然后使劲的摇晃杯子");
    }

    @Override
    void operateTemp() {
        Log.i("skyt", "最好放冰箱冰着");
    }
}

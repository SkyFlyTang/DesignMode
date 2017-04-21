package com.pb.design.mode.test.facade;

import android.util.Log;

public class AirCondition {

    public void airConditionaOn() {
        Log.e("AirCondition", "on");
    }

    public void airConditionaOff() {
        Log.e("AirCondition", "off");
    }

    public void setTemperature(int temperature) {
        Log.e("AirCondition", "temperature:" + temperature);
    }
}
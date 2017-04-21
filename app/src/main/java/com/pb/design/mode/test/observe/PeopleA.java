package com.pb.design.mode.test.observe;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by skytang on 2017/4/21.
 */

public class PeopleA implements Observer {

    Weather weather;

    public PeopleA(Weather weather) {
        this.weather = weather;
        Log.i("skyt", "温度：" + weather.getTemp() + " 湿度;" + weather.getHum() + " 风力:" + weather.getWind());
    }

    @Override
    public void update(Observable o, Object arg) {
        weather = (Weather) arg;
        Log.i("skyt", "更改:" + "温度：" + weather.getTemp() + " 湿度;" + weather.getHum() + " 风力:" + weather.getWind());
    }
}

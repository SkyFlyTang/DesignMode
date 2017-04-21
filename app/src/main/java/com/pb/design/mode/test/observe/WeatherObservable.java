package com.pb.design.mode.test.observe;

import java.util.Observable;

/**
 * Created by skytang on 2017/4/21.
 */

public class WeatherObservable extends Observable {
    private Weather weather;

    public WeatherObservable(Weather weather) {
        this.weather = weather;
    }
    public void updateTemp(int temp){
        weather.setTemp(temp);
        setChanged();
        notifyObservers(weather);
        clearChanged();
    }
    public void updateHum(int hum){
        weather.setHum(hum);
        setChanged();
        notifyObservers(weather);
        clearChanged();
    }
    public void updateWind(int wind){
        weather.setWind(wind);
        setChanged();
        notifyObservers(weather);
        clearChanged();

    }
}

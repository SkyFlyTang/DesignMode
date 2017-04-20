package com.pb.design.mode.test.bridgingmode;

/**
 * Created by skytang on 2017/4/20.
 */

public abstract class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;

    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public abstract void installEngine();
}

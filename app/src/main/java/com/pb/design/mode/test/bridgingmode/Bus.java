package com.pb.design.mode.test.bridgingmode;

/**
 * Created by skytang on 2017/4/20.
 */

public class Bus extends Car {

    public Bus(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngine() {
        getEngine().installEngine();
    }
}

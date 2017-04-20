package com.pb.design.mode.test.bridgingmode;

/**
 * Created by skytang on 2017/4/20.
 */

public class Jeep extends Car {
    public Jeep(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngine() {
        this.getEngine().installEngine();
    }
}

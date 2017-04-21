package com.pb.design.mode.test.template;

/**
 * Created by skytang on 2017/4/21.
 */

public abstract class Beverage {

    public final void drink() {
        operateWater();
        operateCup();
        operateTemp();
    }

    abstract void operateWater();

    abstract void operateCup();

    abstract void operateTemp();

}

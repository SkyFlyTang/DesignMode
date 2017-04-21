package com.pb.design.mode.test.decorate;

/**
 * Created by skytang on 2017/4/21.
 */

public class Change implements TheGreatestSage {

    private TheGreatestSage sage;

    public Change(TheGreatestSage sage) {
        this.sage = sage;
    }

    @Override
    public void move() {
        sage.move();
    }
}

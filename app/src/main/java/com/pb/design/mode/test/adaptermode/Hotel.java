package com.pb.design.mode.test.adaptermode;

/**
 * Created by skytang on 2017/4/20.
 */

public class Hotel {
    HongKongInterface charge;

    public void setCharge(HongKongInterface charge) {
        this.charge = charge;
    }

    public void charge() {
        charge.ChargeWithCircle();
    }
}

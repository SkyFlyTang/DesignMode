package com.pb.design.mode.test.adaptermode;

/**
 * Created by skytang on 2017/4/20.
 */

public class AdapterCharge implements HongKongInterface {

    private ChinaInterface charge;

    public AdapterCharge() {
        charge = new ChinaCharge();
    }

    @Override
    public void ChargeWithCircle() {
        charge.ChargeWithSquare();
    }
}

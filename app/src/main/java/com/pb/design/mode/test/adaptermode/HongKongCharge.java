package com.pb.design.mode.test.adaptermode;

import android.util.Log;

/**
 * Created by skytang on 2017/4/20.
 */

public class HongKongCharge implements HongKongInterface {
    @Override
    public void ChargeWithCircle() {
        Log.i("skyt", "使用圆形插座充电");
    }
}

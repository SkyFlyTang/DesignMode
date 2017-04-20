package com.pb.design.mode.test.adaptermode;

import android.util.Log;

/**
 * Created by skytang on 2017/4/20.
 */

public class ChinaCharge implements ChinaInterface {
    @Override
    public void ChargeWithSquare() {
        Log.i("skyt", "使用方形接口充电");
    }
}

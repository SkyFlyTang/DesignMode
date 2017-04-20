package com.pb.design.mode.test.bridgingmode;

import android.util.Log;

/**
 * Created by skytang on 2017/4/20.
 */

public class Engine2000 implements Engine {
    @Override
    public void installEngine() {
        Log.i("skyt", "安装2000CC发动引擎");
    }
}

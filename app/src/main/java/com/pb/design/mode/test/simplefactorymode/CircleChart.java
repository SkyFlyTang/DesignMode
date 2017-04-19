package com.pb.design.mode.test.simplefactorymode;

import com.elvishew.xlog.XLog;

/**
 * Created by skytang on 2017/4/19.
 */

public class CircleChart implements Chart {

    public CircleChart() {
        XLog.i("create circle chart");
    }

    @Override
    public void draw() {
        XLog.i("draw circle chart");
    }

    @Override
    public void erase() {
        XLog.i("erase circle chart");
    }
}

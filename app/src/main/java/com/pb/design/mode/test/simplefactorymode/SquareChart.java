package com.pb.design.mode.test.simplefactorymode;

import com.elvishew.xlog.XLog;

/**
 * Created by skytang on 2017/4/19.
 */

public class SquareChart implements Chart {

    public SquareChart() {
        XLog.i("Create Square Chart");
    }

    @Override
    public void draw() {
        XLog.i("draw Square Chart");
    }

    @Override
    public void erase() {
        XLog.i("erase Square Chart");
    }
}

package com.pb.design.mode.test.simplefactorymode;

import com.elvishew.xlog.XLog;

/**
 * Created by skytang on 2017/4/19.
 */

public class LineChart implements Chart {

    public LineChart() {
        XLog.i("Create Line Chart");
    }

    @Override
    public void draw() {
        XLog.i("draw Line Chart");
    }

    @Override
    public void erase() {
        XLog.i("erase Line Chart");
    }
}

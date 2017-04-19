package com.pb.design.mode.test.simplefactorymode;

import com.elvishew.xlog.XLog;

/**
 * Created by skytang on 2017/4/19.
 */

public class ChartFactory {


    public static final int CircleChart = 0;
    public static final int LineChart = 1;
    public static final int SquareChart = 2;


    public static Chart GetChart(int ChartType) {
        switch (ChartType) {
            case CircleChart:
                return new CircleChart();
            case LineChart:
                return new LineChart();
            case SquareChart:
                return new SquareChart();
            default:
                XLog.e("UnSupportedShapeException");
                return null;
        }

    }
}

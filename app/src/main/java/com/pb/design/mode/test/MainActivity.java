package com.pb.design.mode.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.pb.design.mode.test.simplefactorymode.ChartFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ChartFactory.GetChart(ChartFactory.CircleChart).draw();
        ChartFactory.GetChart(ChartFactory.LineChart).draw();
        ChartFactory.GetChart(ChartFactory.SquareChart).draw();
    }
}

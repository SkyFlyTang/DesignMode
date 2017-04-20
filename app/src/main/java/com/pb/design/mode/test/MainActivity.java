package com.pb.design.mode.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.pb.design.mode.test.singlemode.Singleton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Singleton.INSTANCE.testString();
    }
}

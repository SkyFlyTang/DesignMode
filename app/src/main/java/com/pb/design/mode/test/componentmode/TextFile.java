package com.pb.design.mode.test.componentmode;

import android.util.Log;

/**
 * Created by skytang on 2017/4/20.
 */

public class TextFile extends File {
    public TextFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        Log.i("skyt", "这是文本文件，文件名：" + super.getName());
    }
}

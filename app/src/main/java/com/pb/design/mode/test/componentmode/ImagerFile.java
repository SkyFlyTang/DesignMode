package com.pb.design.mode.test.componentmode;

import android.util.Log;

/**
 * Created by skytang on 2017/4/20.
 */

public class ImagerFile extends File {
    public ImagerFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        Log.i("skyt", "这是图片文件，文件名：" + super.getName());
    }
}

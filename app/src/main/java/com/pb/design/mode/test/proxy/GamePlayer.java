package com.pb.design.mode.test.proxy;

import android.util.Log;

/**
 * Created by skytang on 2017/4/21.
 */

public class GamePlayer implements IGame {
    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        Log.i("skyt", name + "正在" + "攻击");
    }

    @Override
    public void move() {
        Log.i("skyt", name + "正在" + "行走");

    }

    @Override
    public void dead() {
        Log.i("skyt", name + "已经" + "死亡");

    }

    @Override
    public void update() {
        Log.i("skyt", name + "已经" + "升级");

    }
}

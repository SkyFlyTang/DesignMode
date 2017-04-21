package com.pb.design.mode.test.proxy;

/**
 * Created by skytang on 2017/4/21.
 */

public class GamePlayerProxy implements IGame {
    private IGame player = null;

    public GamePlayerProxy(IGame player) {
        this.player = player;
    }

    @Override
    public void attack() {
        player.attack();
    }

    @Override
    public void move() {
        player.move();
    }

    @Override
    public void dead() {
        player.dead();
    }

    @Override
    public void update() {
        player.update();
    }
}

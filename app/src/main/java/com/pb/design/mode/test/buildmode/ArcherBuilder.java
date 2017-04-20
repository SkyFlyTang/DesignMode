package com.pb.design.mode.test.buildmode;

/**
 * Created by skytang on 2017/4/20.
 */

public class ArcherBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("弓箭手");
    }

    @Override
    public void buildSex() {
        actor.setSex("半兽人");
    }

    @Override
    public void buildFace() {
        actor.setFace("马脸");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("兽甲");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("光头");
    }
}

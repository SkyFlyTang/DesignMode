package com.pb.design.mode.test.buildmode;

/**
 * Created by skytang on 2017/4/20.
 */

public class KnightBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("骑士");
    }

    @Override
    public void buildSex() {
        actor.setSex("女");
    }

    @Override
    public void buildFace() {
        actor.setFace("方脸");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("天使套装");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("披肩长发");
    }
}

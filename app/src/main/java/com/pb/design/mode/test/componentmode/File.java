package com.pb.design.mode.test.componentmode;

/**
 * Created by skytang on 2017/4/20.
 */

public abstract class File {
    String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void display();
}

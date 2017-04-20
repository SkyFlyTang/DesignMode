package com.pb.design.mode.test.prototypemode;

/**
 * Created by skytang on 2017/4/20.
 */

public class School implements Cloneable {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public School clone() {
        Object object = null;

        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (School) object;
    }
}

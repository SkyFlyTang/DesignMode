package com.pb.design.mode.test.prototypemode;

import android.util.Log;

/**
 * Created by skytang on 2017/4/20.
 */

public class People implements Cloneable {
    private String name;
    private int age;
    private School school;
    private int height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public People clone() {
        People object = null;
        try {
            object = (People) super.clone();
        } catch (CloneNotSupportedException exception) {
            Log.e(People.class.getName(), "Not support cloneable");
        }
        if (object != null) {//原型模式使用clone方法去复制的时候，如果对象不是值对象，那么仅仅只是复制对象的地址，不是创建新的对象
            School school = object.getSchool();
            if (school != null) {
                object.setSchool(school.clone());
            }
        }
        return object;
    }
}

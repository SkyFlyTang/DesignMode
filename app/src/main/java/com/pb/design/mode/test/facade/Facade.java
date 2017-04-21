package com.pb.design.mode.test.facade;

/**
 * Created by skytang on 2017/4/21.
 */

public class Facade {
    private Light mLight;
    private AirCondition mAirCondition;

    /**
     * 还可能会有方法集，比如我的习惯是下班回家，开灯、开空调，空调温度调节到20度
     * Facade与Adapter和Proxy有类似之处，
     * 但是Proxy注重在为Client-Subject提供一个访问的中间层，
     * Adapter注重对接口的转换与调整，
     * 而Facade所面对的往往是多个类或其他程序单元，
     * 通过重新组合各类及程序单元，对外提供统一的接口/界面。
     */
    public Facade() {
        mLight = new Light();
        mAirCondition = new AirCondition();
    }

    public void doMyHabit() {
        mLight.lightOn();
        mAirCondition.airConditionaOn();
        mAirCondition.setTemperature(20);
    }

    public void lightOn() {
        mLight.lightOn();
    }

    public void lightOff() {
        mLight.lightOff();
    }

    public void airConditionaOn() {
        mAirCondition.airConditionaOn();
    }

    public void airConditionaOff() {
        mAirCondition.airConditionaOff();
    }

    public void setTemperature(int temperature) {
        mAirCondition.setTemperature(temperature);
    }
}


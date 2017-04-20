package com.pb.design.mode.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.pb.design.mode.test.adaptermode.AdapterCharge;
import com.pb.design.mode.test.adaptermode.HongKongCharge;
import com.pb.design.mode.test.adaptermode.HongKongInterface;
import com.pb.design.mode.test.adaptermode.Hotel;
import com.pb.design.mode.test.bridgingmode.Bus;
import com.pb.design.mode.test.bridgingmode.Car;
import com.pb.design.mode.test.bridgingmode.Engine;
import com.pb.design.mode.test.bridgingmode.Engine2000;
import com.pb.design.mode.test.bridgingmode.Engine2200;
import com.pb.design.mode.test.bridgingmode.Jeep;
import com.pb.design.mode.test.prototypemode.People;
import com.pb.design.mode.test.prototypemode.School;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testAdapterMode();

        testBridg();


    }

    private void testBridg() {
        Engine engine2000 = new Engine2000();
        Engine engine2200 = new Engine2200();

        Car bus = new Bus(engine2000);
        bus.installEngine();

        Car jeep = new Jeep(engine2200);
        jeep.installEngine();
    }

    private void testAdapterMode() {
        HongKongInterface hongKongInterface = new HongKongCharge();
        Hotel hotel = new Hotel();
        AdapterCharge adapterCharge = new AdapterCharge();
        hotel.setCharge(adapterCharge);
        hotel.charge();
    }

    private void testSingleMode() {
        School school = new School();
        school.setAddress("泰邦科技大厦");
        school.setName("北大");

        People people = new People();
        people.setName("小明");
        people.setAge(18);
        people.setHeight(160);
        people.setSchool(school);

        People peopleClone = people.clone();

        peopleClone.setName("小红");
        peopleClone.setHeight(178);
        peopleClone.setAge(23);
        peopleClone.getSchool().setName("人民大学");

        Log.i("skyt", people.getName() + " " + people.getAge() + " " + people.getHeight() + " " + people.getSchool().getName() + " " + people.getSchool().getAddress());
        Log.i("skyt", peopleClone.getName() + " " + peopleClone.getAge() + " " + peopleClone.getHeight() + " " + peopleClone.getSchool().getName() + " " + peopleClone.getSchool().getAddress());
    }
}

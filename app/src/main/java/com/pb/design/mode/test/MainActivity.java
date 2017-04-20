package com.pb.design.mode.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.pb.design.mode.test.prototypemode.People;
import com.pb.design.mode.test.prototypemode.School;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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

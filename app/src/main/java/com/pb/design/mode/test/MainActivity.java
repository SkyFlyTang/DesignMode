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
import com.pb.design.mode.test.command.Command;
import com.pb.design.mode.test.command.ConcreteCommandImpl1;
import com.pb.design.mode.test.command.ConcreteCommandImpl2;
import com.pb.design.mode.test.command.InvokerRole;
import com.pb.design.mode.test.command.ReceiverRole;
import com.pb.design.mode.test.componentmode.Folder;
import com.pb.design.mode.test.componentmode.ImagerFile;
import com.pb.design.mode.test.componentmode.TextFile;
import com.pb.design.mode.test.componentmode.VideoFile;
import com.pb.design.mode.test.decorate.Bird;
import com.pb.design.mode.test.decorate.Fish;
import com.pb.design.mode.test.decorate.Monkey;
import com.pb.design.mode.test.decorate.TheGreatestSage;
import com.pb.design.mode.test.observe.PeopleA;
import com.pb.design.mode.test.observe.Weather;
import com.pb.design.mode.test.observe.WeatherObservable;
import com.pb.design.mode.test.prototypemode.People;
import com.pb.design.mode.test.prototypemode.School;
import com.pb.design.mode.test.proxy.GamePlayer;
import com.pb.design.mode.test.proxy.GamePlayerProxy;
import com.pb.design.mode.test.proxy.IGame;
import com.pb.design.mode.test.strategy.BinaryOrdering;
import com.pb.design.mode.test.strategy.QuickSort;
import com.pb.design.mode.test.strategy.SortUtils;
import com.pb.design.mode.test.template.Coffee;
import com.pb.design.mode.test.template.Tee;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testCommand();


    }

    private void testCommand() {
        //创建一个命令接收者
        ReceiverRole receiverRole1 = new ReceiverRole();                //创建一个命令的具体实现对象，并指定命令接收者
        Command command1 = new ConcreteCommandImpl1(receiverRole1);
        Command command2 = new ConcreteCommandImpl2(receiverRole1);

        InvokerRole invokerRole = new InvokerRole();//创建一个命令调用者
        invokerRole.setCommand1(command1);//为调用者指定命令对象1
        invokerRole.setCommand2(command2);//为调用者指定命令对象2
        invokerRole.invoke(0);                //发起调用命令请求
        invokerRole.invoke(1);                //发起调用命令请求
    }

    private void testTemplate() {
        Coffee coffee = new Coffee();
        Tee tee = new Tee();
        coffee.drink();
        tee.drink();
    }

    private void testProxyMode() {
        IGame player = new GamePlayer("deep");
        IGame proxy = new GamePlayerProxy(player);
        proxy.move();
        proxy.attack();
        proxy.update();
        proxy.dead();
    }

    private void testObserver() {
        Weather weather = new Weather();
        weather.setTemp(35);
        weather.setHum(132);
        weather.setWind(1);
        PeopleA peopleA = new PeopleA(weather);
        WeatherObservable observable = new WeatherObservable(weather);
        observable.addObserver(peopleA);
        observable.updateHum(500);
        observable.updateTemp(19);
        observable.updateWind(5);
    }

    private void testStrategy(ArrayList<Integer> list) {
        BinaryOrdering binaryOrdering = new BinaryOrdering();
        QuickSort quickSort = new QuickSort();
        SortUtils sortUtils = new SortUtils(binaryOrdering);
        sortUtils.Sort(list);

        sortUtils.setmISort(quickSort);
        sortUtils.Sort(list);
    }

    private void testDecorate() {
        TheGreatestSage sage = new Monkey();
        //孙悟空变成一只鸟
        Bird bird = new Bird(sage);
        bird.move();
        bird.fly();

        //孙悟空变成一只鱼
        Fish fish = new Fish(sage);
        fish.move();
        fish.swim();
    }

    private void testComponent() {
        Folder zwjj = new Folder("总文件夹");
        //向总文件夹中放入三个文件：1.txt、2.jpg、1文件夹
        TextFile aText = new TextFile("a.txt");
        ImagerFile bImager = new ImagerFile("b.jpg");
        Folder cFolder = new Folder("C文件夹");

        zwjj.add(aText);
        zwjj.add(bImager);
        zwjj.add(cFolder);

        //向C文件夹中添加文件：c_1.txt、c_1.rmvb、c_1.jpg
        TextFile cText = new TextFile("c_1.txt");
        ImagerFile cImage = new ImagerFile("c_1.jpg");
        VideoFile cVideo = new VideoFile("c_1.rmvb");

        cFolder.add(cText);
        cFolder.add(cImage);
        cFolder.add(cVideo);

       /* //遍历C文件夹
        cFolder.display();
        //将c_1.txt删除
        cFolder.remove(cText);
        Log.i("skyt", "-----------------------");
        cFolder.display();*/

        zwjj.display();
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

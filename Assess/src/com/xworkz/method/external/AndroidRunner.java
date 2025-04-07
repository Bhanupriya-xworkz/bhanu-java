package com.xworkz.method.external;
import com.xworkz.method.internal.Robot;
import com.xworkz.method.internal.Android;

public class AndroidRunner {
    public static void main(String[] args) {
        Robot robot1 = new Robot();
        robot1.crawl();
        robot1.fly();
        robot1.hide();
        robot1.eat();
        robot1.shedSkin();

        System.out.println("=============");

        Android android=new Android();
        android.crawl();
        android.fly();
        android.hide();
        android.eat();
    }
}

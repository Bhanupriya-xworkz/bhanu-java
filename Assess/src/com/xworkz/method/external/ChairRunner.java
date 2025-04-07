package com.xworkz.method.external;

import com.xworkz.method.internal.Chair;
import com.xworkz.method.internal.RobotChair;

    public class RobotChairRunner {
        public static void main(String[] args) {
            Chair chair1 = new Chair();
            chair1.sit();
            chair1.move();
            chair1.breakChair();
            chair1.clean();
            chair1.adjust();
            chair1.decorate();

            System.out.println("=============");

            RobotChair robotChair = new RobotChair();
            robotChair.sit();
            robotChair.move();
            robotChair.breakChair();
            robotChair.clean();
            robotChair.adjust();
            robotChair.decorate();
        }
    }

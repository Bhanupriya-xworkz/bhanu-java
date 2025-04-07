package com.xworkz.method.external;

public class BananaRunner {
        public static void main(String[] args) {

            Banana banana = new Banana();
            banana.peel();
            banana.eat();
            banana.store();
            banana.ripen();
            banana.throwAway();
            banana.taste();

            System.out.println("=============");

            RobotBanana robotBanana = new RobotBanana();
            robotBanana.peel();
            robotBanana.eat();
            robotBanana.store();
            robotBanana.ripen();
            robotBanana.throwAway();
            robotBanana.taste();
        }
    }

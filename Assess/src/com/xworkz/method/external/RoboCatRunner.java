package com.xworkz.method.external;

public class RoboCatRunner {
        public static void main(String[] args) {
            Cat cat1 = new Cat();
            cat1.meow();
            cat1.sleep();
            cat1.eat();
            cat1.play();
            cat1.groom();

            System.out.println("=============");

            RobotCat robotCat = new RobotCat();
            robotCat.meow();
            robotCat.sleep();
            robotCat.eat();
            robotCat.play();
            robotCat.groom();
        }
    }

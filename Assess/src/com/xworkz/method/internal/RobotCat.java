package com.xworkz.method.internal;

    public class RobotCat extends Cat {

        public RobotCat() {
            System.out.println("RobotCat is created...");
        }

        @Override
        public void meow() {
            System.out.println("RobotCat is making robotic meowing sound...");
        }

        @Override
        public void sleep() {
            System.out.println("RobotCat is in standby mode...");
        }

        @Override
        public void eat() {
            System.out.println("RobotCat is charging its battery...");
        }

        @Override
        public void play() {
            System.out.println("RobotCat is playing with a laser pointer...");
        }

        @Override
        public void groom() {
            System.out.println("RobotCat is cleaning its mechanical parts...");
        }
    }



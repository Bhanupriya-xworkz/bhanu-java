package com.xworkz.method.internal;

    public class RobotBanana extends Banana {

        public RobotBanana() {
            System.out.println("RobotBanana is created...");
        }

        @Override
        public void peel() {
            System.out.println("RobotBanana uses a robotic arm to peel the banana...");
        }

        @Override
        public void eat() {
            System.out.println("RobotBanana simulates eating the banana with a robotic mouth...");
        }

        @Override
        public void store() {
            System.out.println("RobotBanana stores itself in a robotic storage unit...");
        }

        @Override
        public void ripen() {
            System.out.println("RobotBanana is ripening in a controlled environment...");
        }

        @Override
        public void throwAway() {
            System.out.println("RobotBanana disposes of the peel using a robotic waste system...");
        }

        @Override
        public void taste() {
            System.out.println("RobotBanana is analyzing the taste using advanced sensors...");
        }
    }

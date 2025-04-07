package com.xworkz.method.internal;

    public class RobotChair extends Chair {

        public RobotChair() {
            System.out.println("RobotChair is created...");
        }

        @Override
        public void sit() {
            System.out.println("RobotChair is adjusting for the best sitting posture...");
        }

        @Override
        public void move() {
            System.out.println("RobotChair is moving automatically...");
        }

        @Override
        public void breakChair() {
            System.out.println("RobotChair detects damage and repairs itself...");
        }

        @Override
        public void clean() {
            System.out.println("RobotChair is self-cleaning...");
        }

        @Override
        public void adjust() {
            System.out.println("RobotChair is adjusting based on user preferences...");
        }

        @Override
        public void decorate() {
            System.out.println("RobotChair is adding stylish decorations using LEDs...");
        }
    }

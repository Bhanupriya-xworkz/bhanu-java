package com.xworkz.Interface.internal;

    public class Quadcopter implements Drone {
        @Override
        public void takeOff() {
            System.out.println("QuadCopter executing: takeOff");
        }

        @Override
        public void fly() {
            System.out.println("QuadCopter executing: fly");
        }

        @Override
        public void land() {
            System.out.println("QuadCopter executing: land");
        }
    }


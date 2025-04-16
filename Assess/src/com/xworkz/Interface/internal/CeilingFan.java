package com.xworkz.Interface.internal;

    public class CeilingFan implements Fan {
        @Override
        public void turnOn() {
            System.out.println("CeilingFan executing: turnOn");
        }

        @Override
        public void rotate() {
            System.out.println("CeilingFan executing: rotate");
        }

        @Override
        public void turnOff() {
            System.out.println("CeilingFan executing: turnOff");
        }
    }


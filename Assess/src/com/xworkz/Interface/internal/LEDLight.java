package com.xworkz.Interface.internal;

    public class LEDLight implements Light {

        @Override
        public void turnOn() {
            System.out.println("LED Light is turned ON.");
        }

        @Override
        public void turnOff() {
            System.out.println("LED Light is turned OFF.");
        }

        @Override
        public void adjustBrightness() {
            System.out.println("Adjusting brightness to 75%.");
        }
    }


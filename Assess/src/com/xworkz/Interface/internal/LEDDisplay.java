package com.xworkz.Interface.internal;

    public class LEDDisplay implements Screen {

        @Override
        public void turnOn() {
            System.out.println("LED screen is now ON.");
        }

        @Override
        public void turnOff() {
            System.out.println("LED screen is now OFF.");
        }

        @Override
        public void displayResolution() {
            System.out.println("Resolution: 1920x1080 (Full HD)");
        }
    }


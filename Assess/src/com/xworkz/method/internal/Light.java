package com.xworkz.method.internal;

    public class SmartLight extends Light {

        public SmartLight() {
            System.out.println("SmartLight instance created.");
        }

        @Override
        public void turnOn() {
            System.out.println("SmartLight is turned on using mobile app.");
        }

        @Override
        public void turnOff() {
            System.out.println("SmartLight is turned off remotely.");
        }

        @Override
        public void dim() {
            System.out.println("SmartLight is dimmed via voice control.");
        }

        @Override
        public void brighten() {
            System.out.println("SmartLight is set to full brightness.");
        }

        @Override
        public void blink() {
            System.out.println("SmartLight is blinking with color effect.");
        }

        public void schedule() {
            System.out.println("SmartLight is scheduled to turn on at 6 PM.");
        }
    }


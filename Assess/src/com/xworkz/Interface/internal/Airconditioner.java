package com.xworkz.Interface.internal;

    public class Airconditioner implements AC {
        @Override
        public void turnOn() {
            System.out.println("AirConditioner executing: turnOn");
        }

        @Override
        public void setTemperature() {
            System.out.println("AirConditioner executing: setTemperature");
        }

        @Override
        public void turnOff() {
            System.out.println("AirConditioner executing: turnOff");

        }
    }

    @Override
    public void maintenanceTips() {
        System.out.println("Split AC Tip: Service the unit before summer and winter seasons.");
    }


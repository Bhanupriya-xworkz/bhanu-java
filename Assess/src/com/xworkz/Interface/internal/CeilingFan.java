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
    @Override
    public void maintenanceTips() {
        System.out.println("Ceiling Fan Tip: Make sure the fan blades are balanced to avoid wobbling.");
    }


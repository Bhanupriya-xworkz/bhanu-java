package com.xworkz.Interface.internal;

    public class Washingmachine implements Appliance {

        @Override
        public void turnOn() {
            System.out.println("Washing machine is now ON.");
        }

        @Override
        public void operate() {
            System.out.println("Washing clothes on Quick Wash mode.");
        }

        @Override
        public void turnOff() {
            System.out.println("Washing machine is now OFF.");
        }
    }
    @Override
    public void safetyTips() {
        System.out.println("Washing Machine Tip: Don’t overload and always clean the lint filter.");
    }


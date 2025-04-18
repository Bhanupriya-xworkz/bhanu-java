package com.xworkz.Interface.internal;

    public class AirpodsPro implements Airpods {

        @Override
        public void connect() {
            System.out.println("AirPods Pro connected via Bluetooth.");
        }

        @Override
        public void playSound() {
            System.out.println("Playing crystal-clear sound with noise cancellation.");
        }

        @Override
        public void disconnect() {
            System.out.println("AirPods Pro disconnected.");

        }
    }

    @Override
    public void batteryTips() {
        System.out.println("AirPods Pro Tip: Enable Optimized Battery Charging in settings for better battery health.");
    }


package com.xworkz.inheretence.internal;

    public class iPhone extends AppleDevice {

        public iPhone() {
            super();  // Calling the parent class constructor
            System.out.println("iPhone constructor");
        }

        @Override
        public void startDevice() {
            super.startDevice();
            System.out.println("Starting iPhone...");
        }

        @Override
        public void checkBattery() {
            super.checkBattery();
            System.out.println("Checking iPhone battery...");
        }

        @Override
        public void updateSoftware() {
            super.updateSoftware();
            System.out.println("Updating iPhone software...");
        }

        @Override
        public void enableFaceID() {
            super.enableFaceID();
            System.out.println("Enabling Face ID on iPhone...");
        }

        @Override
        public void enableNightMode() {
            super.enableNightMode();
            System.out.println("Enabling Night Mode on iPhone...");
        }
    }


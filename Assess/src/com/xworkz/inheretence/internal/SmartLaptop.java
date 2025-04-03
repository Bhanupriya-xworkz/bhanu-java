package com.xworkz.inheretence.internal;

    public class MacBook extends Laptop {

        public MacBook() {
            super();  // Calling the parent class constructor
            System.out.println("MacBook constructor");
        }

        public void startLaptop() {
            super.startLaptop();
            System.out.println("Starting the MacBook...");
        }

        public void checkBattery() {
            super.checkBattery();
            System.out.println("Checking the MacBook battery...");
        }

        public void updateSoftware() {
            super.updateSoftware();
            System.out.println("Updating MacBook software...");
        }

        public void connectToWiFi() {
            super.connectToWiFi();
            System.out.println("Connecting MacBook to WiFi with seamless connection...");
        }

        public void turnOff() {
            super.turnOff();
            System.out.println("Turning off the MacBook...");
        }

        public void enableTouchBar() {
            System.out.println("Enabling Touch Bar on MacBook...");
        }

        public void enableSiri() {
            System.out.println("Activating Siri on MacBook...");
        }

        public void enableMacOSFeatures() {
            System.out.println("Enabling macOS features on MacBook...");
        }
    }


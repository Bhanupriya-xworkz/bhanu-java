package com.xworkz.inheretence.internal;

    public class MacBook extends LaptopDevice {

        // Constructor for MacBook
        public MacBook() {
            super();  // Calling the parent class constructor
            System.out.println("MacBook constructor");
        }

        public void startLaptop() {
            super.startLaptop();
            System.out.println("Starting MacBook...");
        }

        public void checkBattery() {
            super.checkBattery();
            System.out.println("Checking MacBook battery...");
        }

        public void updateOS() {
            super.updateOS();
            System.out.println("Updating MacBook operating system...");
        }

        public void enableWiFi() {
            super.enableWiFi();
            System.out.println("Enabling WiFi on MacBook...");
        }

        public void enableBluetooth() {
            super.enableBluetooth();
            System.out.println("Enabling Bluetooth on MacBook...");
        }
    }


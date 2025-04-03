package com.xworkz.inheretence.internal;

    public class SmartDigitalPhone extends Smartphone {

        public SmartDigitalPhone() {
            super();  // Calling the parent class constructor
            System.out.println("SmartDigitalPhone constructor");
        }


        public void makeCall() {
            super.makeCall();
            System.out.println("Making a call through VoIP or digital services...");
        }

        public void sendMessage() {
            super.sendMessage();
            System.out.println("Sending an instant message through messaging apps...");
        }

        public void browseInternet() {
            super.browseInternet();
            System.out.println("Browsing the internet with high-speed 5G or Wi-Fi...");
        }

        public void takePhoto() {
            super.takePhoto();
            System.out.println("Taking a high-resolution photo with a digital camera lens...");
        }

        public void checkBatteryStatus() {
            super.checkBatteryStatus();
            System.out.println("Checking the battery status with advanced battery management features...");
        }
    }


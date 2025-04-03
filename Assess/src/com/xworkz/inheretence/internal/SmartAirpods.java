package com.xworkz.inheretence.internal;

public class SmartAirpods {

        public SmartAirPods() {
            super();  // Calling the parent class constructor
            System.out.println("SmartAirPods constructor");
        }

        public void playMusic() {
            super.playMusic();
            System.out.println("Playing music with enhanced sound quality on SmartAirPods...");
        }

        public void pauseMusic() {
            super.pauseMusic();
            System.out.println("Pausing music with touch controls on SmartAirPods...");
        }

        public void adjustVolume() {
            super.adjustVolume();
            System.out.println("Adjusting volume via touch or voice assistant on SmartAirPods...");
        }

        public void connectToDevice() {
            super.connectToDevice();
            System.out.println("Connecting SmartAirPods with seamless Bluetooth pairing...");
        }

        public void disconnectFromDevice() {
            super.disconnectFromDevice();
            System.out.println("Disconnecting SmartAirPods with automatic device switching...");
        }

        public void activateNoiseCancellation() {
            System.out.println("Activating noise cancellation feature on SmartAirPods...");
        }

        public void trackBattery() {
            System.out.println("Tracking battery level and providing charging notifications...");
        }

        public void useSiri() {
            System.out.println("Using Siri voice assistant with SmartAirPods...");
        }

        public void enableTransparencyMode() {
            System.out.println("Enabling Transparency mode to hear external sounds with SmartAirPods...");
        }
    }


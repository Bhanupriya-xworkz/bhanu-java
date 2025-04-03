package com.xworkz.inheretence.internal;

    public class SmartMusicPlayer extends MusicPlayer {

        private boolean isBluetoothConnected;
        private String supportedApp;

        public SmartMusicPlayer(String brand, boolean isBluetoothConnected, String supportedApp) {
            super(brand);  // Calling the parent class constructor
            this.isBluetoothConnected = isBluetoothConnected;
            this.supportedApp = supportedApp;
            System.out.println("No-args constructor of SmartMusicPlayer");

            playMusic();
            stopMusic();
            adjustVolume(15);
            displayInfo();
        }

        public void connectToBluetooth() {
            if (isBluetoothConnected) {
                System.out.println("Connecting to Bluetooth...");
            } else {
                System.out.println("Bluetooth is not available.");
            }
        }

        public void streamFromApp() {
            System.out.println("Streaming music from " + supportedApp + "...");
        }

        @Override
        public void displayInfo() {
            super.displayInfo();  // Calling the parent method
            System.out.println("Bluetooth Connected: " + (isBluetoothConnected ? "Yes" : "No"));
            System.out.println("Supported App: " + supportedApp);
        }
    }


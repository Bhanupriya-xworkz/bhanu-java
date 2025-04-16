package com.xworkz.Interface.internal;

    public class BluetoothSpeaker implements Bluetooth {

        @Override
        public void pairDevice() {
            System.out.println("Pairing with smartphone...");
        }

        @Override
        public void unpairDevice() {
            System.out.println("Device unpaired successfully.");
        }

        @Override
        public void transferData() {
            System.out.println("Streaming audio via Bluetooth.");
        }
    }


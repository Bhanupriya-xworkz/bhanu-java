package com.xworkz.Interface.internal;

    public interface Bluetooth {
        void pairDevice();
        void unpairDevice();
        void transferData();
        default void connectionTips() {
            System.out.println("General Tip: Keep devices within range (10 meters) for a stable connection.");
        }
    }


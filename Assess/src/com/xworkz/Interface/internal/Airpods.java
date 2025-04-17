package com.xworkz.Interface.internal;

    public interface Airpods {
        void connect();

        void playSound();

        void disconnect();

        default void batteryTips() {
            System.out.println("General Tip: Keep your AirPods between 20% - 80% charge for longer battery life.");
        }
    }


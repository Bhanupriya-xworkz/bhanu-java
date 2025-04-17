package com.xworkz.Interface.internal;

    public interface Appliance {
        void turnOn();
        void operate();
        void turnOff();
        default void safetyTips() {
            System.out.println("General Appliance Safety Tip: Unplug appliances when not in use.");
        }
    }


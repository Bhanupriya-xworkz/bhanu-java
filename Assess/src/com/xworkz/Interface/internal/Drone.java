package com.xworkz.Interface.internal;

    public interface Drone {
        void takeOff();
        void fly();
        void land();

        default void maintenanceTips() {
            System.out.println("General Tip: Check battery levels and inspect propellers before every flight.");
        }
    }


package com.xworkz.Interface.internal;

    public interface Robot {
        void wakeUp();
        void performTask();
        void shutDown();

        default void robotTip() {
            System.out.println("General Tip: Regular maintenance ensures optimal robot performance.");
        }
    }


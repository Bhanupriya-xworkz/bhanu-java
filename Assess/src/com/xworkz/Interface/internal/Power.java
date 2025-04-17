package com.xworkz.Interface.internal;

    public interface Power {
        void turnOn();
        void turnOff();
        void getPowerSource();

        default void powerTip() {
            System.out.println("General Tip: Turn off electrical appliances when not in use to save energy.");
        }
    }


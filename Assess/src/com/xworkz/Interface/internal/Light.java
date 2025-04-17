package com.xworkz.Interface.internal;

    public interface Light {
        void turnOn();
        void turnOff();
        void adjustBrightness();

        default void lightingTips() {
            System.out.println("General Tip: Use LED bulbs to save energy and reduce your electricity bill.");
        }
    }


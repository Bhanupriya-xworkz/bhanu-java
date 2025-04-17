package com.xworkz.Interface.internal;

    public interface LightBulb {
        void switchOn();
        void switchOff();
        void adjustBrightness();

        default void energySavingTip() {
            System.out.println("General Tip: LED bulbs use up to 80% less energy than traditional bulbs.");
        }
    }


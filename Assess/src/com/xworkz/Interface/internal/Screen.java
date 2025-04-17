package com.xworkz.Interface.internal;

    public interface Screen {
        void turnOn();
        void turnOff();
        void displayResolution();

        default void screenTip() {
            System.out.println("General Tip: Avoid using the screen for long hours to reduce eye strain.");
        }
    }


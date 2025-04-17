package com.xworkz.Interface.internal;

    public interface TrafficSignal {
        void showSignal();
        void waitTime();
        void actionToTake();

        default void signalTip() {
            System.out.println("General Tip: Always follow traffic lights for everyone's safety.");
        }
    }


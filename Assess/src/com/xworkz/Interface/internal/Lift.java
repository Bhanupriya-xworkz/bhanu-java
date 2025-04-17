package com.xworkz.Interface.internal;

    public interface Lift {
        void callLift();
        void moveToFloor();
        void openDoor();

        default void liftSafetyTips() {
            System.out.println("General Tip: Do not use lifts during a fire or emergency evacuation.");
        }
    }


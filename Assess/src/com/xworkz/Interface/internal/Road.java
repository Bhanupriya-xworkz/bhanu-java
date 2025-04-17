package com.xworkz.Interface.internal;

    public interface Road {
        void openRoad();
        void closeRoad();
        void showCondition();

        default void roadSafetyTip() {
            System.out.println("General Tip: Obey traffic rules and wear seat belts at all times.");
        }
    }


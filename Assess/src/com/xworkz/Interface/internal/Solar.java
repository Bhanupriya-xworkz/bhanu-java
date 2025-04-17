package com.xworkz.Interface.internal;

    public interface Solar {
        void generatePower();
        void storeEnergy();
        void showStatus();

        default void solarTip() {
            System.out.println("General Tip: Keep the solar panels clean to maintain maximum efficiency.");
        }
    }


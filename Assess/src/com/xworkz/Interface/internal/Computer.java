package com.xworkz.Interface.internal;

    public interface Computer {
        void powerOn();
        void runProgram();
        void shutDown();

        default void maintenanceTips() {
            System.out.println("General Tip: Keep your computer dust-free and update software regularly.");
        }
    }


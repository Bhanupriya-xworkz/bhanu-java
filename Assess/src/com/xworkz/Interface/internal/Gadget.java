package com.xworkz.Interface.internal;

    public interface Gadget {
        void powerOn();
        void showSpecs();
        void shutdown();

        default void maintenanceTips() {
            System.out.println("General Tip: Clean your gadget regularly and keep software up-to-date.");
        }
    }


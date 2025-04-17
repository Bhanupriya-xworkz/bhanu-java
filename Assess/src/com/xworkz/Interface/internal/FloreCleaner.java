package com.xworkz.Interface.internal;
    public interface FloreCleaner {
        void startCleaning();
        void showStatus();
        void stopCleaning();

        default void maintenanceTips() {
            System.out.println("General Tip: Clean the dust container regularly for optimal performance.");
        }
    }


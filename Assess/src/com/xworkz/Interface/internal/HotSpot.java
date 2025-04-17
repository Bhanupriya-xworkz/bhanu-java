package com.xworkz.Interface.internal;

    public interface HotSpot {
        void setCoordinates();
        void showDetails();
        void markVisited();

        default void hotspotTips() {
            System.out.println("General Tip: Always secure your Wi-Fi hotspot with a strong password to avoid unauthorized access.");
        }
    }


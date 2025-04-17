package com.xworkz.Interface.internal;

    public interface Location {
        void setCoordinates();
        void showDetails();
        void markVisited();

        default void travelTips() {
            System.out.println("General Travel Tip: Always carry a map and stay hydrated.");
        }
    }


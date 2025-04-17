package com.xworkz.Interface.internal;

    public interface Theator {
        void setCoordinates();
        void showDetails();
        void markVisited();

        default void theaterTip() {
            System.out.println("General Tip: Arrive 15 minutes early to avoid missing previews and find your seat.");
        }
    }


package com.xworkz.Interface.internal;

    public interface Zoo {
        void setCoordinates();
        void showDetails();
        void markVisited();

        default void zooTip() {
            System.out.println("General Tip: Maintain clean enclosures for healthy animals.");
        }
    }


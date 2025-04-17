package com.xworkz.Interface.internal;
    public interface Root {
        void setCoordinates();
        void showDetails();
        void markVisited();

        default void rootTip() {
            System.out.println("General Tip: Keep your root structure organized for easier access.");
        }
    }


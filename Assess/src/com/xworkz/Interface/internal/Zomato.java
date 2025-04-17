package com.xworkz.Interface.internal;

    public interface Zomato {
        void viewMenu();
        void placeOrder();
        void trackOrder();

        default void zomatoTips() {
            System.out.println("General Tip: Check ratings and reviews before placing an order.");
        }
    }


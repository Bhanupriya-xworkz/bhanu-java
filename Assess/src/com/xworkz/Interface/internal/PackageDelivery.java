package com.xworkz.Interface.internal;

    public interface PackageDelivery {
        void pickUp();
        void transit();
        void deliver();

        default void deliveryTip() {
            System.out.println("General Tip: Always label fragile items clearly and use proper packaging.");
        }
    }


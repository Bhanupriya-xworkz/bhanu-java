package com.xworkz.Interface.internal;

    public class CourierService implements PackageDelivery {

        @Override
        public void pickUp() {
            System.out.println("Package picked up by courier.");
        }

        @Override
        public void transit() {
            System.out.println("Package is in transit.");
        }

        @Override
        public void deliver() {
            System.out.println("Package delivered successfully.");
        }
    }

    @Override
    public void deliveryTip() {
        System.out.println("Courier Tip: Choose express delivery for important or time-sensitive packages.");
    }


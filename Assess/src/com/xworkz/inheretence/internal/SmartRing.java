package com.xworkz.inheretence.internal;

    public class SmartRing extends Ring {

        public SmartRing() {
            super();  // Calling the parent class constructor
            System.out.println("SmartRing constructor");
        }


        public void checkSize() {
            super.checkSize();
            System.out.println("Checking the size of the SmartRing...");
        }

        public void checkMaterial() {
            super.checkMaterial();
            System.out.println("Checking the material of the SmartRing...");
        }

        public void wearRing() {
            super.wearRing();
            System.out.println("Wearing the SmartRing...");
        }

        public void cleanRing() {
            super.cleanRing();
            System.out.println("Cleaning the SmartRing...");
        }

        public void storeRing() {
            super.storeRing();
            System.out.println("Storing the SmartRing safely with its charging dock...");
        }

        public void trackHeartRate() {
            System.out.println("Tracking heart rate with the SmartRing...");
        }

        public void trackSteps() {
            System.out.println("Tracking steps with the SmartRing...");
        }

        public void enableSleepTracking() {
            System.out.println("Enabling sleep tracking with the SmartRing...");
        }

        public void syncWithPhone() {
            System.out.println("Syncing SmartRing data with your phone...");
        }
    }

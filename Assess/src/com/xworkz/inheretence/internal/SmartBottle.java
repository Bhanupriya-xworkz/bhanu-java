package com.xworkz.inheretence.internal;

    public class SmartBottle extends Bottle {

        public SmartBottle() {
            super();  // Calling the parent class constructor
            System.out.println("SmartBottle constructor");
        }

        @Override
        public void fillWater() {
            super.fillWater();
            System.out.println("Filling the smart bottle with water...");
        }

        @Override
        public void drinkWater() {
            super.drinkWater();
            System.out.println("Drinking water from the smart bottle...");
        }

        @Override
        public void cleanBottle() {
            super.cleanBottle();
            System.out.println("Cleaning the smart bottle with self-cleaning features...");
        }

        @Override
        public void checkCapacity() {
            super.checkCapacity();
            System.out.println("Checking the smart bottle's water capacity using sensors...");
        }

        @Override
        public void closeBottle() {
            super.closeBottle();
            System.out.println("Closing the smart bottle securely...");
        }

        public void trackWaterIntake() {
            System.out.println("Tracking water intake using the smart bottle...");
        }

        public void sendReminder() {
            System.out.println("Sending reminder to drink more water...");
        }

        public void syncWithApp() {
            System.out.println("Syncing the smart bottle with the health app...");
        }
    }

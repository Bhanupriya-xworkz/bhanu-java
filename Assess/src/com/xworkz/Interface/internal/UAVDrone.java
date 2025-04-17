package com.xworkz.Interface.internal;

    public interface UAVDrone implements Drone {

        @Override
        public void startCleaning() {
            System.out.println("Cleaning started. The robot is now sweeping the floor.");
        }

        @Override
        public void showStatus() {
            System.out.println("Current Status: 50% cleaned. Battery at 75%.");
        }

        @Override
        public void stopCleaning() {
            System.out.println("Cleaning stopped. Robot returning to charging dock.");
        }
    }

package com.xworkz.inheretence.internal;

    public class WashingMachine extends Appliance {

        public WashingMachine() {
            super();  // Calling the parent class constructor
            System.out.println("No-args constructor of WashingMachine");

            // Calling parent class methods
            powerOn();
            checkStatus();
            reset();
            powerOff();
        }

        public void startWashing() {
            System.out.println("Starting the washing cycle...");
        }

        public void stopWashing() {
            System.out.println("Stopping the washing cycle...");
        }

        public void addDetergent() {
            System.out.println("Adding detergent to the washing machine...");
        }

        public void spinDry() {
            System.out.println("Spinning to dry the clothes...");
        }
    }


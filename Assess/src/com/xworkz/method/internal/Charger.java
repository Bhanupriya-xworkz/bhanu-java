package com.xworkz.method.internal;

    public class Charger {

        public Charger() {
            System.out.println("Charger is initialized.");
        }

        public void plugIn() {
            System.out.println("Charger is plugged into the device...");
        }

        public void plugOut() {
            System.out.println("Charger is unplugged from the device...");
        }

        public void charge() {
            System.out.println("Charging the device...");
        }

        public void stopCharging() {
            System.out.println("Charging stopped...");
        }

        public void displayStatus() {
            System.out.println("Charger status: Device is charging...");
        }
    }



package com.xworkz.inheretence.internal;

    public class SmartCharger extends Charger {

        public SmartCharger() {
            super();
            System.out.println("SmartCharger constructor");
        }

        public void checkPower() {
            super.checkPower();
            System.out.println("Checking the power of the SmartCharger...");
        }

        public void checkCompatibility() {
            super.checkCompatibility();
            System.out.println("Checking the compatibility of the SmartCharger...");
        }
        public void plugIn() {
            super.plugIn();
            System.out.println("Plugging in the SmartCharger...");
        }

        public void unplug() {
            super.unplug();
            System.out.println("Unplugging the SmartCharger...");
        }

        public void chargeDevice() {
            super.chargeDevice();
            System.out.println("Charging the device with the SmartCharger...");
        }

        public void fastCharge() {
            System.out.println("Activating fast charge with the SmartCharger...");
        }

        public void monitorCharging() {
            System.out.println("Monitoring charging status with the SmartCharger...");
        }

        public void controlTemperature() {
            System.out.println("Controlling the temperature during charging with the SmartCharger...");
        }

        public void sendNotification() {
            System.out.println("Sending charging completion notification with the SmartCharger...");
        }
    }


package com.xworkz.method.internal;

    public class SmartCharger extends Charger {

        public SmartCharger() {
            System.out.println("SmartCharger is initialized with advanced features.");
        }

        @Override
        public void plugIn() {
            System.out.println("SmartCharger is plugged in and detecting device type...");
        }

        @Override
        public void plugOut() {
            System.out.println("SmartCharger is unplugged and saving energy usage data...");
        }

        @Override
        public void charge() {
            System.out.println("SmartCharger is charging with optimized power flow...");
        }

        @Override
        public void stopCharging() {
            System.out.println("SmartCharger stops charging when the device is fully charged...");
        }

        @Override
        public void displayStatus() {
            System.out.println("SmartCharger status: Device is charging with intelligent management...");
        }

        public void monitorBattery() {
            System.out.println("SmartCharger is monitoring battery health and charging rate...");
        }

        public void adjustChargingSpeed() {
            System.out.println("SmartCharger adjusts charging speed based on battery temperature and health...");
        }
    }


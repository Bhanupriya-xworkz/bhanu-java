package com.xworkz.FiveInterface.Internal;

    public class SmartCharger extends Charger
            implements FastCharging, WirelessCharging, USBTypeC, BatteryProtection, SmartControl {

        @Override
        void plugIn() {
            System.out.println("Charger plugged in.");
        }

        @Override
        void unplug() {
            System.out.println("Charger unplugged.");
        }

        @Override
        void showChargingStatus() {
            System.out.println("Charging status: 80% charged.");
        }

        @Override
        public void enableFastCharge() {
            System.out.println("Fast charging enabled.");
        }

        @Override
        public void startWirelessCharging() {
            System.out.println("Wireless charging started.");
        }

        @Override
        public void connectUSBTypeC() {
            System.out.println("USB Type-C connected.");
        }

        @Override
        public void activateOverchargeProtection() {
            System.out.println("Overcharge protection activated.");
        }

        @Override
        public void connectToApp() {
            System.out.println("Connected to mobile app for control.");
        }
}

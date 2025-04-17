package com.xworkz.FiveInterface.Internal;

    public class SmartCable extends Cable
            implements FastDataTransfer, PowerDelivery, BraidedDesign, MagneticTip, UniversalCompatibility {

        @Override
        void connectDevice() {
            System.out.println("Device connected via SmartCable.");
        }

        @Override
        void disconnectDevice() {
            System.out.println("Device disconnected.");
        }

        @Override
        void transferData() {
            System.out.println("Transferring data through the cable.");
        }

        // Implement interface methods
        @Override
        public void enableFastTransfer() {
            System.out.println("Fast data transfer enabled.");
        }

        @Override
        public void supportPowerDelivery() {
            System.out.println("Power delivery supported up to 100W.");
        }

        @Override
        public void showBraidedStrength() {
            System.out.println("Braided design ensures durability.");
        }

        @Override
        public void attachMagnetically() {
            System.out.println("Cable magnetically attached to port.");
        }

        @Override
        public void checkCompatibility() {
            System.out.println("Compatible with USB-C, Lightning, and Micro-USB.");
        }
}

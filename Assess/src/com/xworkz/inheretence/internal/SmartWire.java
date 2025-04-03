package com.xworkz.inheretence.internal;

    public class SmartWire extends Wire {

        public SmartWire() {
            super();  // Calling the parent class constructor
            System.out.println("SmartWire constructor");
        }

        public void checkLength() {
            super.checkLength();
            System.out.println("Checking the length of the SmartWire...");
        }

        public void checkMaterial() {
            super.checkMaterial();
            System.out.println("Checking the material of the SmartWire...");
        }

        public void connect() {
            super.connect();
            System.out.println("Connecting the SmartWire...");
        }

        public void disconnect() {
            super.disconnect();
            System.out.println("Disconnecting the SmartWire...");
        }

        public void insulateWire() {
            super.insulateWire();
            System.out.println("Insulating the SmartWire with advanced materials...");
        }

        public void monitorPowerFlow() {
            System.out.println("Monitoring power flow through the SmartWire...");
        }

        public void controlHeat() {
            System.out.println("Controlling the temperature of the SmartWire...");
        }

        public void sendAlerts() {
            System.out.println("Sending alerts if the SmartWire is damaged or overloaded...");
        }
    }


package com.xworkz.inheretence.internal;

    public class Appliance {

        public Appliance() {
            System.out.println("No-args constructor of Appliance");
        }

        public void powerOn() {
            System.out.println("Powering on the appliance...");
        }

        public void powerOff() {
            System.out.println("Powering off the appliance...");
        }

        public void checkStatus() {
            System.out.println("Checking the status of the appliance...");
        }

        public void reset() {
            System.out.println("Resetting the appliance...");
        }
    }

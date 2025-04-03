package com.xworkz.inheretence.internal;

    public class DigitalCable extends Cable {

        // Constructor for DigitalCable
        public DigitalCable() {
            super();  // Calling the parent class constructor
            System.out.println("DigitalCable constructor");
        }

        // Overriding methods for DigitalCable (if necessary)
        @Override
        public void checkLength() {
            super.checkLength();
            System.out.println("Checking the length of the Digital Cable...");
        }

        @Override
        public void checkMaterial() {
            super.checkMaterial();
            System.out.println("Checking the material of the Digital Cable...");
        }

        @Override
        public void checkSpeed() {
            super.checkSpeed();
            System.out.println("Checking the speed capabilities of the Digital Cable...");
        }

        @Override
        public void installCable() {
            super.installCable();
            System.out.println("Installing the Digital Cable...");
        }

        @Override
        public void testCable() {
            super.testCable();
            System.out.println("Testing the Digital Cable...");
        }
    }


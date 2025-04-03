package com.xworkz.inheretence.internal;

    public class DigitalCloth extends Cloth {

        public DigitalCloth() {
            super();  // Calling the parent class constructor
            System.out.println("DigitalCloth constructor");
        }

        public void checkFabric() {
            super.checkFabric();
            System.out.println("Checking the fabric of the Digital Cloth (virtual representation)...");
        }

        public void checkColor() {
            super.checkColor();
            System.out.println("Checking the color of the Digital Cloth (virtual display)...");
        }

        public void wearCloth() {
            super.wearCloth();
            System.out.println("Wearing the Digital Cloth in a virtual environment...");
        }

        public void washCloth() {
            super.washCloth();
            System.out.println("Washing the Digital Cloth (no real washing needed)...");
        }

        public void checkSize() {
            super.checkSize();
            System.out.println("Checking the size of the Digital Cloth in the virtual environment...");
        }
    }


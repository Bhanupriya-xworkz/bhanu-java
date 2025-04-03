package com.xworkz.inheretence.internal;

    public class DigitalBanner extends Banner {

        public DigitalBanner() {
            super();
            System.out.println("DigitalBanner constructor");
        }

        public void checkSize() {
            super.checkSize();
            System.out.println("Checking the size of the Digital Banner...");
        }

        public void checkMaterial() {
            super.checkMaterial();
            System.out.println("Checking the digital material of the Digital Banner...");
        }

        public void printBanner() {
            super.printBanner();
            System.out.println("Printing the Digital Banner...");
        }

        public void displayBanner() {
            super.displayBanner();
            System.out.println("Displaying the Digital Banner on screen...");
        }

        public void checkDesign() {
            super.checkDesign();
            System.out.println("Checking the design of the Digital Banner...");
        }
    }


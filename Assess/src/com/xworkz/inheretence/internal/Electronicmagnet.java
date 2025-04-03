package com.xworkz.inheretence.internal;

    public class Electromagnet extends Magnet {

        public Electromagnet() {
            super();  // Calling the parent class constructor
            System.out.println("No-args constructor of Electromagnet");
        }

        public void attractMetal() {
            super.attractMetal();
            System.out.println("Electromagnet attracts metal objects with controlled force.");
        }

        public void repel() {
            super.repel();
            System.out.println("Electromagnet repels objects with adjustable polarity.");
        }

        public void turnOnElectricity() {
            System.out.println("Turning on the electric current to power the electromagnet.");
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("This is an electromagnet, a magnet that uses electric current.");
        }
    }


package com.xworkz.Interface.internal;

    public class SolarPanel implements Solar {

        @Override
        public void generatePower() {
            System.out.println("Generating solar power from sunlight...");
        }

        @Override
        public void storeEnergy() {
            System.out.println("Storing energy in the battery.");
        }

        @Override
        public void showStatus() {
            System.out.println("Solar Panel Status: Active and charging.");
        }
    }

    @Override
    public void solarTip() {
        System.out.println("Solar Tip: Consider upgrading to high-efficiency solar panels for better performance.");
    }


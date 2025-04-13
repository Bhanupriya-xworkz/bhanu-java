package com.xworkz.method.internal;

    public class SportsShoes extends Wearable {
        public SportsShoes() {
            System.out.println("SportsShoes instance created.");
        }

        @Override
        public void wear() {
            System.out.println("SportsShoes are being worn.");
        }

        @Override
        public void wash() {
            System.out.println("SportsShoes are being washed.");
        }

        @Override
        public void dry() {
            System.out.println("SportsShoes are drying quickly.");
        }

        @Override
        public void pack() {
            System.out.println("SportsShoes are packed in a shoebox.");
        }

        @Override
        public void display() {
            System.out.println("SportsShoes are displayed in the store.");
        }

        public void runnerSpecial() {
            System.out.println("This is a runner-specific SportsShoe feature.");
        }
    }


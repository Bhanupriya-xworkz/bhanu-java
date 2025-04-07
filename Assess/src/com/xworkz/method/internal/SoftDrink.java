package com.xworkz.method.internal;

    public class SoftDrink extends Drinks {

        public SoftDrink() {
            System.out.println("Soft Drink is created...");
        }

        @Override
        public void pour() {
            System.out.println("Pouring the soft drink into a glass...");
        }

        @Override
        public void stir() {
            System.out.println("Stirring the soft drink with ice...");
        }

        @Override
        public void taste() {
            System.out.println("Tasting the refreshing taste of soft drink...");
        }

        @Override
        public void chill() {
            System.out.println("Chilling the soft drink with ice cubes...");
        }

        @Override
        public void drink() {
            System.out.println("Drinking the sweet soft drink...");
        }

        @Override
        public void refill() {
            System.out.println("Refilling the soft drink in the glass...");
        }
    }


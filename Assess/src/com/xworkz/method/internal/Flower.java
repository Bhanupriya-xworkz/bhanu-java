package com.xworkz.method.internal;

    public class Flower extends Flore {

        public Flower() {
            System.out.println("Flower is created...");
        }

        @Override
        public void bloom() {
            System.out.println("Flower is blooming with vibrant colors...");
        }

        @Override
        public void photosynthesize() {
            System.out.println("Flower is photosynthesizing and producing oxygen...");
        }

        @Override
        public void grow() {
            System.out.println("Flower is growing tall and strong...");
        }

        @Override
        public void spreadSeeds() {
            System.out.println("Flower is spreading its seeds through the wind...");
        }

        @Override
        public void wither() {
            System.out.println("Flower is wilting after blooming...");
        }
    }


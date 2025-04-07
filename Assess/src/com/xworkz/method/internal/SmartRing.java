package com.xworkz.method.internal;

    public class SmartRing extends Ring {

        public SmartRing() {
            System.out.println("SmartRing is created...");
        }

        @Override
        public void wear() {
            System.out.println("SmartRing is being worn on your finger...");
        }

        @Override
        public void sparkle() {
            System.out.println("SmartRing has LED lights that sparkle...");
        }

        @Override
        public void adjust() {
            System.out.println("SmartRing is adjusting its fit automatically...");
        }

        @Override
        public void remove() {
            System.out.println("SmartRing is being removed...");
        }

        @Override
        public void clean() {
            System.out.println("SmartRing is being cleaned with smart tech...");
        }

        @Override
        public void store() {
            System.out.println("SmartRing is stored in a wireless charging case...");
        }
    }

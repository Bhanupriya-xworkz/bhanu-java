package com.xworkz.method.internal;

    public class ElectricCar extends Car {

        public ElectricCar() {
            System.out.println("Electric Car is created...");
        }

        @Override
        public void start() {
            System.out.println("Electric Car is starting silently...");
        }

        @Override
        public void stop() {
            System.out.println("Electric Car is stopping smoothly...");
        }

        @Override
        public void accelerate() {
            System.out.println("Electric Car is accelerating quietly...");
        }

        @Override
        public void brake() {
            System.out.println("Electric Car is braking efficiently...");
        }

        @Override
        public void honk() {
            System.out.println("Electric Car is honking softly...");
        }

        @Override
        public void fuel() {
            System.out.println("Electric Car is charging...");
        }
    }


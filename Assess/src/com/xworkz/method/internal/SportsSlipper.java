package com.xworkz.method.internal;
    public class SportsSlipper extends Slipper {

        public SportsSlipper() {
            System.out.println("Sports Slipper is created...");
        }

        @Override
        public void wear() {
            System.out.println("Sports Slipper is being worn for exercise...");
        }

        @Override
        public void remove() {
            System.out.println("Sports Slipper is being removed after a workout...");
        }

        @Override
        public void clean() {
            System.out.println("Sports Slipper is being cleaned with a cloth...");
        }

        @Override
        public void store() {
            System.out.println("Sports Slipper is being stored in a locker...");
        }

        @Override
        public void repair() {
            System.out.println("Sports Slipper is being repaired by stitching...");
        }

        @Override
        public void slip() {
            System.out.println("Sports Slipper is providing grip while running...");
        }
    }


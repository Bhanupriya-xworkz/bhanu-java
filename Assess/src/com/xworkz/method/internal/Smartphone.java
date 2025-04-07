package com.xworkz.method.internal;

    public class Smartphone extends Laptop {

        public Smartphone() {
            System.out.println("Smartphone is created...");
        }

        @Override
        public void bootUp() {
            System.out.println("Smartphone is booting up...");
        }

        @Override
        public void browse() {
            System.out.println("Smartphone is browsing the web using mobile data...");
        }

        @Override
        public void playGames() {
            System.out.println("Smartphone is playing mobile games...");
        }

        @Override
        public void watchMovies() {
            System.out.println("Smartphone is streaming movies...");
        }

        @Override
        public void shutDown() {
            System.out.println("Smartphone is shutting down...");
        }

        @Override
        public void charge() {
            System.out.println("Smartphone is charging wirelessly...");
        }
    }

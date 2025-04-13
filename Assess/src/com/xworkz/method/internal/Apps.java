package com.xworkz.method.internal;

    public class Apps extends Software {

        public Apps() {
            System.out.println("Apps instance created.");
        }

        @Override
        public void install() {
            System.out.println("App is installed from the app store.");
        }

        @Override
        public void run() {
            System.out.println("App is running smoothly.");
        }

        @Override
        public void update() {
            System.out.println("App is receiving an update.");
        }

        @Override
        public void close() {
            System.out.println("App is closed.");
        }

        @Override
        public void display() {
            System.out.println("App information is displayed.");
        }

        public void appFeature() {
            System.out.println("App offers a new dark mode feature!");
        }
    }


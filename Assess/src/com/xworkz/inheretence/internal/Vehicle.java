package com.xworkz.inheretence.internal;

    public class Vehicle {

        public Vehicle() {
            System.out.println("No-args constructor of Vehicle");
        }

        public void startEngine() {
            System.out.println("Starting the vehicle engine...");
        }

        public void stopEngine() {
            System.out.println("Stopping the vehicle engine...");
        }

        public void refuel() {
            System.out.println("Refueling the vehicle...");
        }

        public void checkTires() {
            System.out.println("Checking the tires of the vehicle...");
        }

        public void honk() {
            System.out.println("Honking the vehicle horn...");
        }
    }

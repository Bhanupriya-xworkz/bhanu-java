package com.xworkz.inheretence.internal;

    public class Door {

        public Door() {
            System.out.println("No-args constructor of Door");
        }

        public void open() {
            System.out.println("Opening the door...");
        }

        public void close() {
            System.out.println("Closing the door...");
        }

        public void lock() {
            System.out.println("Locking the door...");
        }

        public void unlock() {
            System.out.println("Unlocking the door...");
        }

        public void displayInfo() {
            System.out.println("This is a regular door.");
        }
    }


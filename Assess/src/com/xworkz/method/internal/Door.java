package com.xworkz.method.internal;

    public class Door {

        public Door() {
            System.out.println("Door is initialized.");
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

        public void displayStatus() {
            System.out.println("The door is currently closed and locked.");
        }
    }

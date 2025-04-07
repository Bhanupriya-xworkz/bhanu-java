package com.xworkz.method.internal;

    public class SmartDoor extends Door {

        public SmartDoor() {
            System.out.println("SmartDoor is initialized with advanced features.");
        }

        @Override
        public void open() {
            System.out.println("SmartDoor: Automatically opening the door using face recognition...");
        }

        @Override
        public void close() {
            System.out.println("SmartDoor: Automatically closing the door after a set time...");
        }

        @Override
        public void lock() {
            System.out.println("SmartDoor: Locking the door with a digital lock and remote access...");
        }

        @Override
        public void unlock() {
            System.out.println("SmartDoor: Unlocking the door using a smartphone app or facial recognition...");
        }

        @Override
        public void displayStatus() {
            System.out.println("SmartDoor status: Door is closed and locked with remote access enabled.");
        }

    }

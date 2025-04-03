package com.xworkz.inheretence.internal;

    public class SlidingDoor extends Door {

        public SlidingDoor() {
            super();  // Calling the parent class constructor
            System.out.println("No-args constructor of SlidingDoor");
        }

        public void open() {
            super.open();
            System.out.println("Sliding the door open smoothly...");
        }

        public void close() {
            super.close();
            System.out.println("Sliding the door close smoothly...");
        }

        public void lock() {
            super.lock();
            System.out.println("Locking the sliding door with an electronic lock...");
        }

        public void unlock() {
            super.unlock();
            System.out.println("Unlocking the sliding door with an electronic lock...");
        }

        public void autoSlide() {
            System.out.println("Automatic sliding of the door initiated.");
        }

        public void displayInfo() {
            super.displayInfo();
            System.out.println("This is a sliding door with smooth motion and an automatic system.");
        }
    }


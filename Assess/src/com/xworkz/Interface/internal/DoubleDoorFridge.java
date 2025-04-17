package com.xworkz.Interface.internal;

    public class DoubleDoorFridge implements Fridge {

        @Override
        public void cool() {
            System.out.println("Cooling at 4°C.");
        }

        @Override
        public void storeFood() {
            System.out.println("Storing vegetables, fruits, and dairy products.");
        }

        @Override
        public void defrost() {
            System.out.println("Auto-defrosting the freezer compartment.");
        }
    }
    @Override
    public void maintenanceTips() {
        System.out.println("Smart Fridge Tip: Keep the door closed to maintain energy efficiency and check for leaks around the seals.");
    }


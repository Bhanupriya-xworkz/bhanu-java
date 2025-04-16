package com.xworkz.Interface.internal;

    public class Elevetor implements Lift {
        @Override
        public void callLift() {
            System.out.println("Elevator executing: callLift");
        }

        @Override
        public void moveToFloor() {
            System.out.println("Elevator executing: moveToFloor");
        }

        @Override
        public void openDoor() {
            System.out.println("Elevator executing: openDoor");
        }
    }


package com.xworkz.Twointerface.Internal;

    public class WashingMachine implements Appliance, Power {

        @Override
        public void turnOn() {
            System.out.println("Washing machine is now ON.");
        }

        @Override
        public void turnOff() {
            System.out.println("Washing machine is now OFF.");
        }

        @Override
        public void voltage() {
            System.out.println("Washing machine voltage: 220V");
        }

        @Override
        public void powerRating() {
            System.out.println("Power rating: 500W");
        }
    }


public class Microwave implements Appliance, Power {

    @Override
    public void turnOn() {
        System.out.println("Microwave is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Microwave is now OFF.");
    }

    @Override
    public void voltage() {
        System.out.println("Microwave voltage: 240V");
    }

    @Override
    public void powerRating() {
        System.out.println("Power rating: 800W");
    }
}


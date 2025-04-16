package com.xworkz.Twointerface.Internal;

    public class Bike implements Vehicle, Fuel {

        @Override
        public void start() {
            System.out.println("Car started.");
        }

        @Override
        public void stop() {
            System.out.println("Car stopped.");
        }

        @Override
        public void fuelType() {
            System.out.println("Fuel: Petrol");
        }

        @Override
        public void fuelEfficiency() {
            System.out.println("Efficiency: 15 km/l");
        }
    }

public class Motorcycle implements Vehicle, Fuel {

    @Override
    public void start() {
        System.out.println("Motorcycle started.");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped.");
    }

    @Override
    public void fuelType() {
        System.out.println("Fuel: Diesel");
    }

    @Override
    public void fuelEfficiency() {
        System.out.println("Efficiency: 40 km/l");
    }
}


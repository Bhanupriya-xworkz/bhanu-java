package com.xworkz.Twointerface.Internal;

    public class Car implements Engine, Fuel {

        @Override
        public void start() {
            System.out.println("Car engine started.");
        }

        @Override
        public void stop() {
            System.out.println("Car engine stopped.");
        }

        @Override
        public void fuelType() {
            System.out.println("Car uses gasoline.");
        }

        @Override
        public void fuelEfficiency() {
            System.out.println("Car has a fuel efficiency of 25 miles per gallon.");
        }
    }


public class Truck implements Engine, Fuel {

    @Override
    public void start() {
        System.out.println("Truck engine started.");
    }

    @Override
    public void stop() {
        System.out.println("Truck engine stopped.");
    }

    @Override
    public void fuelType() {
        System.out.println("Truck uses diesel.");
    }

    @Override
    public void fuelEfficiency() {
        System.out.println("Truck has a fuel efficiency of 15 miles per gallon.");
    }
}


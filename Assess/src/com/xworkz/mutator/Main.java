package com.xworkz.mutator;

public class Main {
        public static void main(String[] args) {
            // Create a new Satellite instance
            Satellite mySatellite = new Satellite(SatelliteType.COMMUNICATION, 150000000, 2000.5, 500);

            System.out.println("Satellite Type: " + mySatellite.getType());
            System.out.println("Cost: $" + mySatellite.getCost());
            System.out.println("Weight: " + mySatellite.getWeight() + " kg");
            System.out.println("Local Capacity: " + mySatellite.getLocalCapacity());

            mySatellite.setType(SatelliteType.WEATHER);
            mySatellite.setCost(180000000);
            mySatellite.setWeight(2500.7);
            mySatellite.setLocalCapacity(600);

            System.out.println("Updated Satellite Type: " + mySatellite.getType());
            System.out.println("Updated Cost: $" + mySatellite.getCost());
            System.out.println("Updated Weight: " + mySatellite.getWeight() + " kg");
            System.out.println("Updated Local Capacity: " + mySatellite.getLocalCapacity());
        }
    }


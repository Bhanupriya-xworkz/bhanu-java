package com.xworkz.Interface.internal;
    public class ZooLocation implements Location {

        @Override
        public void setCoordinates() {
            System.out.println("Coordinates: Latitude 34.0522° N, Longitude 118.2437° W (Los Angeles, USA)");
        }

        @Override
        public void showDetails() {
            System.out.println("Zoo: Los Angeles Zoo\nLocation: Los Angeles, USA\nAnimals: Tigers, Gorillas, Elephants.");
        }

        @Override
        public void markVisited() {
            System.out.println("You have visited the Los Angeles Zoo!");
        }
    }

    @Override
    public void zooTip() {
        System.out.println("Zoo Tip: Provide enrichment activities to keep animals mentally stimulated.");
    }


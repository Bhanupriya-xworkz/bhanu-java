package com.xworkz.Interface.internal;

    public class Shortcut implements Root {

        @Override
        public void setCoordinates() {
            System.out.println("Coordinates: Latitude 40.7128° N, Longitude 74.0060° W (New York City)");
        }

        @Override
        public void showDetails() {
            System.out.println("Location: New York City, USA\nFamous Landmarks: Statue of Liberty, Times Square.");
        }

        @Override
        public void markVisited() {
            System.out.println("You have visited New York City!");
        }
    }


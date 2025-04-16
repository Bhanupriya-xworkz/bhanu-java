package com.xworkz.Interface.internal;

    public class TheatorLocation implements Location {

        @Override
        public void setCoordinates() {
            System.out.println("Coordinates: Latitude 51.5080° N, Longitude 0.1281° W (London, UK)");
        }

        @Override
        public void showDetails() {
            System.out.println("Theater: The Globe Theatre\nLocation: London, UK\nFamous for: Shakespeare's Plays.");
        }

        @Override
        public void markVisited() {
            System.out.println("You have visited The Globe Theatre in London!");
        }
    }


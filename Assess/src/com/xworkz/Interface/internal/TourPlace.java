package com.xworkz.Interface.internal;

    public class TourPlace implements HotSpot {

        @Override
        public void setCoordinates() {
            System.out.println("Coordinates: Latitude 40.7128° N, Longitude 74.0060° W (New York City)");
        }

        @Override
        public void showDetails() {
            System.out.println("Hotspot: New York City, USA Famous Landmarks: Statue of Liberty, Times Square.");
        }

        @Override
        public void markVisited() {
            System.out.println("You have visited this hotspot: New York City!");
        }
    }
    @Override
    public void hotspotTips() {
        System.out.println("Wi-Fi Hotspot Tip: Turn off your hotspot when not in use to save battery and avoid security risks.");
    }


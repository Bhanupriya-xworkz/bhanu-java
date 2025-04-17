package com.xworkz.Interface.internal;

    public class BeachLocation implements Location {

        @Override
        public void setCoordinates() {
            System.out.println("Coordinates: Latitude 27.1751° N, Longitude 78.0421° E (Agra, India)");
        }

        @Override
        public void showDetails() {
            System.out.println("Beach: Waikiki Beach\nLocation: Honolulu, Hawaii\nFeatures: White sand, Clear water, Surfing.");
        }

        @Override
        public void markVisited() {
            System.out.println("You have visited Waikiki Beach in Honolulu!");

            @Override
            public void travelTips(){
                System.out.println("NYC Travel Tip: Use the subway for fast travel and try local street food");

            }
        }
    }


package com.xworkz.Interface.internal;

    public class Ola implements TaxiService {

        private String pickupLocation;
        private String dropLocation;
        private boolean isRideBooked = false;

        @Override
        public void bookRide(String pickup, String drop) {
            this.pickupLocation = pickup;
            this.dropLocation = drop;
            isRideBooked = true;
            System.out.println("Ola ride booked from " + pickupLocation + " to " + dropLocation);
        }

        @Override
        public void trackRide() {
            if (isRideBooked) {
                System.out.println("Tracking your Ola ride from " + pickupLocation + " to " + dropLocation + "...");
            } else {
                System.out.println("No ride booked to track.");
            }
        }

        @Override
        public void cancelRide() {
            if (isRideBooked) {
                System.out.println("Your Ola ride from " + pickupLocation + " to " + dropLocation + " has been canceled.");
                isRideBooked = false;
            } else {
                System.out.println("No ride to cancel.");
            }
        }
    }


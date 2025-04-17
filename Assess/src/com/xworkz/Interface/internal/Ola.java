package com.xworkz.Interface.internal;

    public class Ola implements TaxiService {

        @Override
        public void bookRide(String pickup, String drop) {
            System.out.println("Ola ride booked from ");
        }

        @Override
        public void trackRide() {
                System.out.println("No ride booked to track.");
            }
        @Override
        public void cancelRide() {
                System.out.println("No ride to cancel.");
            }
        }

    @Override
    public void taxiTip() {
        System.out.println("Taxi Tip: Always share your ride details with a friend for safety.");
    }


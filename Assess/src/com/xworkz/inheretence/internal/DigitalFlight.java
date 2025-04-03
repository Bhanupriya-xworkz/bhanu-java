package com.xworkz.inheretence.internal;

    public class DigitalFlight extends Flight {

        public DigitalFlight() {
            super();  // Calling the parent class constructor
            System.out.println("DigitalFlight constructor");
        }

        public void checkFlightDetails() {
            super.checkFlightDetails();
            System.out.println("Checking the digital flight details (online)...");
        }

        public void checkPrice() {
            super.checkPrice();
            System.out.println("Checking the price of the Digital Flight ticket...");
        }

        public void bookFlight() {
            super.bookFlight();
            System.out.println("Booking the flight digitally through an app or website...");
        }

        public void validateTicket() {
            super.validateTicket();
            System.out.println("Validating the Digital Flight ticket electronically via email or app...");
        }

        public void checkSeat() {
            super.checkSeat();
            System.out.println("Checking the seat for the Digital Flight through an online booking system...");
        }
    }

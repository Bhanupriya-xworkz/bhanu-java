package com.xworkz.inheretence.internal;

    public class DigitalTicket extends Ticket {

        public DigitalTicket() {
            super();  // Calling the parent class constructor
            System.out.println("DigitalTicket constructor");
        }

        public void checkEvent() {
            super.checkEvent();
            System.out.println("Checking the event details of the Digital Ticket...");
        }

        public void checkPrice() {
            super.checkPrice();
            System.out.println("Checking the price of the Digital Ticket...");
        }

        public void issueTicket() {
            super.issueTicket();
            System.out.println("Issuing the Digital Ticket electronically...");
        }

        public void validateTicket() {
            super.validateTicket();
            System.out.println("Validating the Digital Ticket via a mobile app...");
        }

        public void checkSeat() {
            super.checkSeat();
            System.out.println("Checking the seat for the Digital Ticket (online booking system)...");
        }
    }


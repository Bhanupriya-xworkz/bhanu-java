package com.xworkz.inheretence.internal;

public class Ticket {

        public Ticket() {
            System.out.println("No-args constructor of Ticket");
        }

        public void checkEvent() {
            System.out.println("Checking the event details of the ticket...");
        }

        public void checkPrice() {
            System.out.println("Checking the price of the ticket...");
        }

        public void issueTicket() {
            System.out.println("Issuing the ticket...");
        }

        public void validateTicket() {
            System.out.println("Validating the ticket...");
        }

        public void checkSeat() {
            System.out.println("Checking the seat assigned for the ticket...");
        }
    }

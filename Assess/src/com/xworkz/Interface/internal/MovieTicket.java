package com.xworkz.Interface.internal;

    public class MovieTicket implements Ticket {

        @Override
        public void book() {
            System.out.println("Movie ticket booked successfully.");
        }

        @Override
        public void cancel() {
            System.out.println("Movie ticket has been cancelled.");
        }

        @Override
        public void showDetails() {
            System.out.println("Movie: Interstellar | Seat: B12 | Time: 7:30 PM");
        }
    }



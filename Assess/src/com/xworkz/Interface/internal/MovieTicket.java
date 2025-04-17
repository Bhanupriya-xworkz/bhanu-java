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

    @Override
    public void ticketTip() {
        System.out.println("Ticket Tip: Book early to get the best seats at lower prices.");
    }



package com.xworkz.Interface.internal;

    public interface Ticket {
        void book();
        void cancel();
        void showDetails();

        default void ticketTip() {
            System.out.println("General Tip: Always double-check the event date and time before booking.");
        }
    }


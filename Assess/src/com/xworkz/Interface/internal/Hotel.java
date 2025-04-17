package com.xworkz.Interface.internal;

    public interface Hotel {
        void checkIn();
        void checkOut();
        void roomService();

        default void hotelTips() {
            System.out.println("General Tip: Always check if breakfast is included before booking a room.");
        }
    }


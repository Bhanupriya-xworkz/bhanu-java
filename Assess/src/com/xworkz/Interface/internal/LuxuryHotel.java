package com.xworkz.Interface.internal;

    public class LuxuryHotel implements Hotel {

        @Override
        public void checkIn() {
            System.out.println("Guest checked in to the luxury hotel.");
        }

        @Override
        public void checkOut() {
            System.out.println("Guest checked out from the luxury hotel.");
        }

        @Override
        public void roomService() {
            System.out.println("Room service: Delivering gourmet meal to the room.");
        }
    }
    @Override
    public void hotelTips() {
        System.out.println("Luxury Hotel Tip: Opt for a room with a view for a better experience.");
    }


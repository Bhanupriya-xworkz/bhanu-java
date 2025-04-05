package com.xworkz.inheretence.internal;

    public class LuxuryHotel extends Hotel {
        public void luxuryInfo() {
            System.out.println("This is a luxury hotel with premium services");
        }

        {
            super.roomService();
            System.out.println("Luxury room service with personal attendants");
        }

        {
            super.housekeeping();
            System.out.println("Luxury housekeeping with turndown service");
        }

        {
            super.checkIn();
            System.out.println("Luxury check-in with welcome drink");
        }

        {
            super.checkOut();
            System.out.println("Express check-out available at luxury hotel");
        }

        {
            super.amenities();
            System.out.println("Luxury amenities like spa, gym, and private pools");
        }
    }


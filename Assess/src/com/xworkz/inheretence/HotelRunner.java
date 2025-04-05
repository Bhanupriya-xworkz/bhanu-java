package com.xworkz.inheretence;

import com.xworkz.inheretence.internal.Hotel;
import com.xworkz.inheretence.internal.LuxuryHotel;

public class HotelRunner {
        public static void main(String[] args) {
            Hotel hotel = new LuxuryHotel();  // Polymorphism: A LuxuryHotel is treated as a Hotel
            hotel.roomService();  // Calls the overridden method from LuxuryHotel

            Hotel basicHotel = new Hotel();  // Creating an object of the base class Hotel
        }
    }


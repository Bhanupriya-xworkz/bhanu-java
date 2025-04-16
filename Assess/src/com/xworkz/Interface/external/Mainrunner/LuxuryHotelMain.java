package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Hotel;
import com.xworkz.Interface.internal.LuxuryHotel;

public class LuxuryHotelMain {
        public static void main(String[] args) {

            Hotel hotel1 = new LuxuryHotel();
            Hotel hotel2 = new LuxuryHotel();
            Hotel hotel3 = new LuxuryHotel();

            hotel1.checkIn();
            hotel2.roomService();
            hotel3.checkOut();
        }
    }


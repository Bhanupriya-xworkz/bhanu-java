package com.xworkz.Twointerface.External;

import com.xworkz.Interface.internal.Hotel;
import com.xworkz.Interface.internal.LuxuryHotel;

public class HotelMain {

        public static void main(String[] args) {
            Hotel h1 = new LuxuryHotel();
            Hotel h2 = new BudgetHotel();

            h1.getName();
            h2.getRating();

            Service s1 = new LuxuryHotel();
            Service s2 = new BudgetHotel();

            s1.roomService();
            s2.freeWifi();
        }
    }


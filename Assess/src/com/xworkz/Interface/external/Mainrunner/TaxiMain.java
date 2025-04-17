package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Ola;
import com.xworkz.Interface.internal.TaxiService;

public class TaxiMain {
        public static void main(String[] args) {
            TaxiService ola = new Ola();

            ola.bookRide("Majestic", "Electronic City");
            ola.trackRide();
            ola.cancelRide();

            taxi.taxiTip();
        }
    }


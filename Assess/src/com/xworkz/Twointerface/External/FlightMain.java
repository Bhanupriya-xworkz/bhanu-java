package com.xworkz.Twointerface.External;

import com.xworkz.Twointerface.Internal.Flight;
import com.xworkz.Twointerface.Internal.InternationalFlight;

public class FlightMain {

        public static void main(String[] args) {
            Flight f1 = new InternationalFlight();
            Flight f2 = new DomesticFlight();

            f1.getFlightNumber();
            f2.getDestination();

            Airline a1 = new InternationalFlight();
            Airline a2 = new DomesticFlight();

            a1.getAirlineName();
            a2.getClassType();
        }
    }


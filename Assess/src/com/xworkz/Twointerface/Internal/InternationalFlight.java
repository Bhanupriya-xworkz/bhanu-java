package com.xworkz.Twointerface.Internal;

    public class InternationalFlight implements Flight, Airline {

        @Override
        public void getFlightNumber() {
            System.out.println("Flight Number: AI102");
        }

        @Override
        public void getDestination() {
            System.out.println("Destination: New York, USA");
        }

        @Override
        public void getAirlineName() {
            System.out.println("Airline: Air India");
        }

        @Override
        public void getClassType() {
            System.out.println("Class: Business");
        }
    }

public class DomesticFlight implements Flight, Airline {

    @Override
    public void getFlightNumber() {
        System.out.println("Flight Number: 6E245");
    }

    @Override
    public void getDestination() {
        System.out.println("Destination: Mumbai");
    }

    @Override
    public void getAirlineName() {
        System.out.println("Airline: IndiGo");
    }

    @Override
    public void getClassType() {
        System.out.println("Class: Economy");
    }
}


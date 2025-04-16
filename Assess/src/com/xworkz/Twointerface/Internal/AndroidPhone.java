package com.xworkz.Twointerface.Internal;

    public class AndroidPhone implements Phone, Network {

        @Override
        public void call() {
            System.out.println("Calling from Android phone...");
        }

        @Override
        public void message() {
            System.out.println("Messaging from Android phone...");
        }

        @Override
        public void getCarrier() {
            System.out.println("Carrier: Airtel");
        }

        @Override
        public void getSignalStrength() {
            System.out.println("Signal: Strong");
        }
    }

public class iPhone implements Phone, Network {

    @Override
    public void call() {
        System.out.println("Calling from iPhone...");
    }

    @Override
    public void message() {
        System.out.println("Messaging from iPhone...");
    }

    @Override
    public void getCarrier() {
        System.out.println("Carrier: Jio");
    }

    @Override
    public void getSignalStrength() {
        System.out.println("Signal: Moderate");
    }
}


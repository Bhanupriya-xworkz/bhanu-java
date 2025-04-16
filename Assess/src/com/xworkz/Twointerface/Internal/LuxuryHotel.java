package com.xworkz.Twointerface.Internal;

    public class LuxuryHotel implements Hotel, Service {

        @Override
        public void getName() {
            System.out.println("Hotel: The Grand Palace");
        }

        @Override
        public void getRating() {
            System.out.println("Rating: 5 stars");
        }

        @Override
        public void roomService() {
            System.out.println("24/7 Room Service Available");
        }

        @Override
        public void freeWifi() {
            System.out.println("High-Speed Wi-Fi Included");
        }
    }

public class BudgetHotel implements Hotel, Service {

    @Override
    public void getName() {
        System.out.println("Hotel: Comfort Inn");
    }

    @Override
    public void getRating() {
        System.out.println("Rating: 3 stars");
    }

    @Override
    public void roomService() {
        System.out.println("Room Service Available from 7am to 10pm");
    }

    @Override
    public void freeWifi() {
        System.out.println("Wi-Fi Available in Lobby Only");
    }
}


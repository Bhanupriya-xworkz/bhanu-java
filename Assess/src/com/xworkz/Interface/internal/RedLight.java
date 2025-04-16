package com.xworkz.Interface.internal;

    public class RedLight implements TrafficSignal {

        @Override
        public void showSignal() {
            System.out.println("Signal: RED");
        }

        @Override
        public void waitTime() {
            System.out.println("Wait Time: 60 seconds");
        }

        @Override
        public void actionToTake() {
            System.out.println("Action: Stop the vehicle.");
        }
    }


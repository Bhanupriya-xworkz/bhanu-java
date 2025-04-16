package com.xworkz.Interface.internal;

    public class SignalTower implements Tower {

        @Override
        public void transmitSignal() {
            System.out.println("Transmitting 5G signal...");
        }

        @Override
        public void receiveSignal() {
            System.out.println("Receiving satellite signal...");
        }

        @Override
        public void towerStatus() {
            System.out.println("Tower Status: Active and Operational");
        }
    }


package com.xworkz.Twointerface.Internal;

    public class Smartphone implements Device, Connectable {

        @Override
        public void powerOn() {
            System.out.println("Smartphone is powering on...");
        }

        @Override
        public void powerOff() {
            System.out.println("Smartphone is shutting down...");
        }

        @Override
        public void connectToWifi() {
            System.out.println("Smartphone connected to Wi-Fi.");
        }

        @Override
        public void disconnectWifi() {
            System.out.println("Smartphone disconnected from Wi-Fi.");
        }
    }

public class Laptop implements Device, Connectable {

    @Override
    public void powerOn() {
        System.out.println("Laptop is booting up...");
    }

    @Override
    public void powerOff() {
        System.out.println("Laptop is shutting down...");
    }

    @Override
    public void connectToWifi() {
        System.out.println("Laptop connected to Wi-Fi.");
    }

    @Override
    public void disconnectWifi() {
        System.out.println("Laptop disconnected from Wi-Fi.");
    }
}


package com.xworkz.Interface.internal;

    public class WifiConnection implements Internet {

        @Override
        public void connect() {
            System.out.println("Connecting to Wi-Fi...");
        }

        @Override
        public void disconnect() {
            System.out.println("Disconnected from Wi-Fi.");
        }

        @Override
        public void showSpeed() {
            System.out.println("Internet Speed: 100 Mbps");
        }
    }

    @Override
    public void internetSafetyTips() {
        System.out.println("Wi-Fi Connection Tip: Always ensure you're connected to a secure network, and use VPN for extra security.");
    }


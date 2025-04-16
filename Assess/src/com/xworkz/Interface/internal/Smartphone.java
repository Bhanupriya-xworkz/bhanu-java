package com.xworkz.Interface.internal;

    public class Smartphone implements Phone {

        @Override
        public void makeCall() {
            System.out.println("Calling a contact...");
        }

        @Override
        public void sendMessage() {
            System.out.println("Sending a text message...");
        }

        @Override
        public void browseInternet() {
            System.out.println("Browsing the internet...");
        }
    }


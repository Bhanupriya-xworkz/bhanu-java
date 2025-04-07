package com.xworkz.method.internal;

public class message {

        public message() {
            System.out.println("message system initialized.");
        }

        public void sendMessage(String message) {
            System.out.println("Sending message: " + message);
        }

        public void receiveMessage(String message) {
            System.out.println("Received message: " + message);
        }

        public void displayMessage(String message) {
            System.out.println("Displaying message: " + message);
        }

        public void encodeMessage(String message) {
            System.out.println("Encoding message: " + message);
        }

        public void decodeMessage(String message) {
            System.out.println("Decoding message: " + message);
        }

        public void alert(String message) {
            System.out.println("Alert: " + message);
        }
    }

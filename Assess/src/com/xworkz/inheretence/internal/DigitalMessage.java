package com.xworkz.inheretence.internal;

    public class DigitalMessage extends Message {

        public DigitalMessage() {
            super();  // Calling the parent class constructor
            System.out.println("DigitalMessage constructor");
        }

        public void composeMessage() {
            super.composeMessage();
            System.out.println("Composing a digital message through an email or instant messaging app...");
        }

        public void sendMessage() {
            super.sendMessage();
            System.out.println("Sending a digital message through email, SMS, or messaging apps...");
        }

        public void receiveMessage() {
            super.receiveMessage();
            System.out.println("Receiving a digital message via email, SMS, or messaging apps...");
        }

        public void deleteMessage() {
            super.deleteMessage();
            System.out.println("Deleting the digital message from the inbox or messaging app...");
        }

        public void displayMessage() {
            super.displayMessage();
            System.out.println("Displaying the digital message on the screen (email, SMS, or app)...");
        }
    }


package com.xworkz.inheretence.internal;

    public class DigitalTransaction extends Transaction {

        public DigitalTransaction() {
            super();  // Calling the parent class constructor
            System.out.println("DigitalTransaction constructor");
        }

        public void processPayment() {
            super.processPayment();
            System.out.println("Processing the digital payment via an online platform...");
        }

        public void issueReceipt() {
            super.issueReceipt();
            System.out.println("Issuing a digital receipt for the transaction...");
        }

        public void checkBalance() {
            super.checkBalance();
            System.out.println("Checking the digital balance after the transaction...");
        }

        public void cancelTransaction() {
            super.cancelTransaction();
            System.out.println("Cancelling the digital transaction online...");
        }

        public void validateTransaction() {
            super.validateTransaction();
            System.out.println("Validating the digital transaction via a mobile app or website...");
        }
    }


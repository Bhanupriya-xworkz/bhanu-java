package com.xworkz.inheretence.internal;

public class Transaction {

        public Transaction() {
            System.out.println("No-args constructor of Transaction");
        }

        public void processPayment() {
            System.out.println("Processing the payment...");
        }

        public void issueReceipt() {
            System.out.println("Issuing the receipt for the transaction...");
        }

        public void checkBalance() {
            System.out.println("Checking the balance after the transaction...");
        }

        public void cancelTransaction() {
            System.out.println("Cancelling the transaction...");
        }

        public void validateTransaction() {
            System.out.println("Validating the transaction...");
        }
    }


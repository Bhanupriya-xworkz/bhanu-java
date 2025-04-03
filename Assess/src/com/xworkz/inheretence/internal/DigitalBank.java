package com.xworkz.inheretence.internal;

    public class DigitalBank extends Bank {

        public DigitalBank() {
            super();  // Calling the parent class constructor
            System.out.println("DigitalBank constructor");
        }

        public void openAccount() {
            super.openAccount();
            System.out.println("Opening a new account digitally through the mobile app or website...");
        }

        public void depositMoney() {
            super.depositMoney();
            System.out.println("Depositing money digitally through online transfer or mobile payment...");
        }

        public void withdrawMoney() {
            super.withdrawMoney();
            System.out.println("Withdrawing money digitally through ATM or online withdrawal...");
        }

        public void checkBalance() {
            super.checkBalance();
            System.out.println("Checking the bank account balance online through the digital platform...");
        }

        public void closeAccount() {
            super.closeAccount();
            System.out.println("Closing the bank account digitally through the app or website...");
        }
    }


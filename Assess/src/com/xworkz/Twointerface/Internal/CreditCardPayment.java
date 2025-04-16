package com.xworkz.Twointerface.Internal;

    public class CreditCardPayment implements PaymentGateway, TransactionDetails {

        @Override
        public void initiatePayment() {
            System.out.println("Credit card payment initiated.");
        }

        @Override
        public void cancelPayment() {
            System.out.println("Credit card payment cancelled.");
        }

        @Override
        public void showTransactionId() {
            System.out.println("Transaction ID: CC123456");
        }

        @Override
        public void showStatus() {
            System.out.println("Status: Successful");
        }
    }

public class UPIPayment implements PaymentGateway, TransactionDetails {

    @Override
    public void initiatePayment() {
        System.out.println("UPI payment initiated.");
    }

    @Override
    public void cancelPayment() {
        System.out.println("UPI payment cancelled.");
    }

    @Override
    public void showTransactionId() {
        System.out.println("Transaction ID: UPI987654");
    }

    @Override
    public void showStatus() {
        System.out.println("Status: Pending");
    }
}


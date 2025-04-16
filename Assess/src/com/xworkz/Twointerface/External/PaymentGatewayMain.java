package com.xworkz.Twointerface.External;

    public class MainClass {
        public static void main(String[] args) {

            PaymentGateway gateway1 = new CreditCardPayment();
            PaymentGateway gateway2 = new UPIPayment();

            gateway1.initiatePayment();
            gateway2.cancelPayment();

            TransactionDetails details1 = new CreditCardPayment();
            TransactionDetails details2 = new UPIPayment();

            details1.showTransactionId();
            details2.showStatus();
        }
    }


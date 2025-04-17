package com.xworkz.Interface.internal;

    public class Paypal implements PaymentGateway {
        @Override
        public void initiatePayment() {
            System.out.println("Payment initiated via PayPal.");
        }

        @Override
        public void confirmPayment() {
            System.out.println("Payment confirmed via PayPal.");
        }

        @Override
        public void cancelPayment() {
            System.out.println("Payment canceled via PayPal.");
        }
    }

    @Override
    public void gatewayTip() {
        System.out.println("Payment Gateway Tip: Always log and monitor transactions for suspicious activity.");
    }


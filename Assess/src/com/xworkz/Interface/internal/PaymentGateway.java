package com.xworkz.Interface.internal;

    public interface PaymentGateway {
        void initiatePayment();
        void confirmPayment();
        void cancelPayment();

        default void gatewayTip() {
            System.out.println("General Tip: Use secure, HTTPS-enabled payment gateways to protect transactions.");
        }
    }


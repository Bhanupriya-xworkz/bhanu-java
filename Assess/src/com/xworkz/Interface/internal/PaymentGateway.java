package com.xworkz.Interface.internal;

    public interface PaymentGateway {
        void initiatePayment();
        void confirmPayment();
        void cancelPayment();
    }


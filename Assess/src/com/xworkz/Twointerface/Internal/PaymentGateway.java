package com.xworkz.Twointerface.Internal;

    public interface PaymentGateway {
        void initiatePayment();
        void cancelPayment();
    }

public interface TransactionDetails {
    void showTransactionId();
    void showStatus();
}


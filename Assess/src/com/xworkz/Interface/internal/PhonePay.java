package com.xworkz.Interface.internal;

public interface PhonePay{

    void sendMoney();
    void cheakBalence();
    void transactionHistory();

    default void appTip() {
        System.out.println("General Tip: Always verify UPI IDs before making a transaction.");
    }
}

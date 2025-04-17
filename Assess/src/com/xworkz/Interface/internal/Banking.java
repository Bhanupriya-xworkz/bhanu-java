package com.xworkz.Interface.internal;

    public interface Banking {
        void deposit(double amount);
        void withdraw(double amount);
        void checkBalance();
        default void fraudPreventionTips() {
            System.out.println("General Tip: Never share your OTP or PIN with anyone.");
        }
    }


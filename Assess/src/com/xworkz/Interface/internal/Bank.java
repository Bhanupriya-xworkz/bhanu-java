package com.xworkz.Interface.internal;

    public interface Bank {
        void login();
        void transferMoney();
        void logout();
        default void customerSupport() {
            System.out.println("General Bank Support: Call 1800-XXX-XXXX for assistance.");
        }
    }


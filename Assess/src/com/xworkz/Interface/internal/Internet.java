package com.xworkz.Interface.internal;

    public interface Internet {
        void connect();
        void disconnect();
        void showSpeed();

        default void internetSafetyTips() {
            System.out.println("General Tip: Always use strong passwords and avoid clicking on suspicious links.");
        }
    }


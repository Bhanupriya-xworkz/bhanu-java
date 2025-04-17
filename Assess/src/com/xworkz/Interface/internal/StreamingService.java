package com.xworkz.Interface.internal;

    public interface StreamingService {
        void login();
        void playContent();
        void logout();

        default void subscriptionTip() {
            System.out.println("General Tip: Use family or student plans to save on subscriptions.");
        }
    }


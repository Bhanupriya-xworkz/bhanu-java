package com.xworkz.Interface.internal;

    public interface Payment {
        void initiate();
        void process();
        void confirm();

            default void paymentTip() {
                System.out.println("General Tip: Never share your UPI PIN or OTP with anyone.");
            }
        }



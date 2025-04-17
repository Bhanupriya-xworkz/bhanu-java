package com.xworkz.Interface.internal;

    public interface Microwave {
        void setTimer();
        void heatFood();
        void stopHeating();

        default void microwaveTip() {
            System.out.println("General Tip: Use microwave-safe containers only.");
        }
    }


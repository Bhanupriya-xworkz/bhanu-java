package com.xworkz.Interface.internal;

    public interface Gold {
        void melt();
        void polish();
        void checkPurity();

        default void investmentTips() {
            System.out.println("General Tip: Gold is a safe investment, but remember to diversify your portfolio.");
        }
    }


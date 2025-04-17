package com.xworkz.Interface.internal;

    public interface Mall {
        void openMall();
        void closeMall();
        void showShops();

        default void mallVisitorTip() {
            System.out.println("General Tip: Weekdays are less crowded than weekends for a peaceful shopping experience.");
        }
    }

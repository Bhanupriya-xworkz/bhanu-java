package com.xworkz.Interface.internal;

    public interface Plastic {
        void melt();
        void recycle();
        void showType();

        default void plasticTip() {
            System.out.println("General Tip: Always recycle plastic to reduce environmental impact.");
        }
    }


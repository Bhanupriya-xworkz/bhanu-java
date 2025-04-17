package com.xworkz.Interface.internal;

    public interface Slipper {
        void wear();
        void remove();
        void clean();

        default void slipperTip() {
            System.out.println("General Tip: Avoid using wet slippers indoors to prevent slipping.");
        }
    }


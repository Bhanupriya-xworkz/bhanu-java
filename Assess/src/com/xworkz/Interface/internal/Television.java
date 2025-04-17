package com.xworkz.Interface.internal;

    public interface Television {
        void powerOn();
        void streamContent();
        void powerOff();

        default void tvTip() {
            System.out.println("General Tip: Reduce brightness to save power and protect your eyes.");
        }
    }
    }


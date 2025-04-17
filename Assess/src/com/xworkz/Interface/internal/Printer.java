package com.xworkz.Interface.internal;

    public interface Printer {
        void loadPaper();
        void printDocument();
        void ejectPaper();

        default void powerTip() {
            System.out.println("General Tip: Turn off electrical appliances when not in use to save energy.");
        }
    }


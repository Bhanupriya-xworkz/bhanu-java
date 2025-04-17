package com.xworkz.Interface.internal;

    public interface Cover {
        void open();
        void close();
        void showMaterial();

        default void careInstructions() {
            System.out.println("General Tip: Clean your cover regularly and avoid exposing it to heat.");
        }
    }


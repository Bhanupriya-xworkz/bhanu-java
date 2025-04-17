package com.xworkz.Interface.internal;

    public interface Sofa {
        void sitOn();
        void layDown();
        void clean();

        default void furnitureTip() {
            System.out.println("General Tip: Regular cleaning ensures longer life of your furniture.");
        }
    }


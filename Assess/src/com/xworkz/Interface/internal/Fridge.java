package com.xworkz.Interface.internal;
    public interface Fridge {
        void cool();
        void storeFood();
        void defrost();

        default void maintenanceTips() {
            System.out.println("General Tip: Clean the fridge coils regularly and defrost the freezer to maintain efficiency.");
        }
    }


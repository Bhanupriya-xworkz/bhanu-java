package com.xworkz.Interface.internal;

    public interface Product {
        void displayProductDetails();
        void applyDiscount();
        void checkAvailability();

        default void productTip() {
            System.out.println("General Tip: Always check the product reviews before making a purchase.");
        }
    }


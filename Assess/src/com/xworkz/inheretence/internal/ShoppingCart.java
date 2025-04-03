package com.xworkz.inheretence.internal;

public class ShoppingCart {

        public ShoppingCart() {
            System.out.println("No-args constructor of ShoppingCart");
        }

        public void addItem() {
            System.out.println("Adding item to the shopping cart...");
        }

        public void removeItem() {
            System.out.println("Removing item from the shopping cart...");
        }

        public void viewCart() {
            System.out.println("Viewing the items in the shopping cart...");
        }

        public void checkout() {
            System.out.println("Proceeding to checkout...");
        }

        public void applyDiscount() {
            System.out.println("Applying discount to the shopping cart...");
        }
    }


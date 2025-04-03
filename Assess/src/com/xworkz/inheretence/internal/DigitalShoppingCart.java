package com.xworkz.inheretence.internal;

    public class DigitalShoppingCart extends ShoppingCart {

        public DigitalShoppingCart() {
            super();  // Calling the parent class constructor
            System.out.println("DigitalShoppingCart constructor");
        }

        public void addItem() {
            super.addItem();
            System.out.println("Adding item to the Digital Shopping Cart (online)...");
        }

        public void removeItem() {
            super.removeItem();
            System.out.println("Removing item from the Digital Shopping Cart (online)...");
        }

        public void viewCart() {
            super.viewCart();
            System.out.println("Viewing items in the Digital Shopping Cart on the website or app...");
        }

        public void checkout() {
            super.checkout();
            System.out.println("Proceeding to checkout in the Digital Shopping Cart (online payment)... ");
        }

        public void applyDiscount() {
            super.applyDiscount();
            System.out.println("Applying digital discount code to the cart...");
        }
    }

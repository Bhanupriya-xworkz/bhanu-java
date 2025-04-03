package com.xworkz.inheretence.internal;

    public class DigitalProduct extends Product {

        public DigitalProduct() {
            super();  // Calling the parent class constructor
            System.out.println("DigitalProduct constructor");
        }

        public void checkAvailability() {
            super.checkAvailability();
            System.out.println("Checking the availability of the Digital Product (online)...");
        }

        public void checkPrice() {
            super.checkPrice();
            System.out.println("Checking the price of the Digital Product (download or subscription-based)...");
        }

        public void shipProduct() {
            super.shipProduct();
            System.out.println("No physical shipping for Digital Product, providing a download link...");
        }

        public void returnProduct() {
            super.returnProduct();
            System.out.println("Returning the Digital Product (might involve refund or cancellation)...");
        }

        public void reviewProduct() {
            super.reviewProduct();
            System.out.println("Reviewing the Digital Product on the online platform...");
        }
    }


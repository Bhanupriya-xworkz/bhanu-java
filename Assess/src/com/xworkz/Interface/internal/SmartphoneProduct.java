package com.xworkz.Interface.internal;

    public class SmartphoneProduct implements Product {

        @Override
        public void displayProductDetails() {
            System.out.println("Product: iPhone 14\nPrice: $999\nColor: Midnight Black\nRAM: 6GB\nStorage: 128GB");
        }

        @Override
        public void applyDiscount() {
            System.out.println("Applying 10% discount on the Smartphone.");
        }

        @Override
        public void checkAvailability() {
            System.out.println("Smartphone is available in stock.");
        }
    }


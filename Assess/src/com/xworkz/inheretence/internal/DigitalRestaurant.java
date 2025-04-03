package com.xworkz.inheretence.internal;

    public class DigitalRestaurant extends Restaurant {

        public DigitalRestaurant() {
            super();  // Calling the parent class constructor
            System.out.println("DigitalRestaurant constructor");
        }

        public void takeOrder() {
            super.takeOrder();
            System.out.println("Taking the customer's order through an online ordering system or app...");
        }

        public void serveFood() {
            super.serveFood();
            System.out.println("Serving food through contactless delivery or pickup...");
        }

        public void cleanTable() {
            super.cleanTable();
            System.out.println("Cleaning the table and preparing it for the next customer, ensuring hygiene in the digital restaurant...");
        }

        public void processPayment() {
            super.processPayment();
            System.out.println("Processing the payment digitally through online payment systems or mobile wallets...");
        }

        public void prepareFood() {
            super.prepareFood();
            System.out.println("Preparing food using automated kitchen systems or digital monitoring tools in the kitchen...");
        }
    }

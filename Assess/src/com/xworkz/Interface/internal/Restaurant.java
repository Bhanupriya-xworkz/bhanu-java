package com.xworkz.Interface.internal;

    public class Restaurant implements Zomato {

        @Override
        public void viewMenu() {
            System.out.println("Viewing the restaurant's menu: Pizza, Pasta, Burger...");
        }

        @Override
        public void placeOrder() {
            System.out.println("Placing order: 2 Pizzas and 1 Pasta.");
        }

        @Override
        public void trackOrder() {
            System.out.println("Order status: Your food is on the way, arriving in 30 minutes.");
        }
    }

    @Override
    public void zomatoTips() {
        System.out.println("Zomato Tip: Use promo codes and wallet offers to save on your next order.");
    }


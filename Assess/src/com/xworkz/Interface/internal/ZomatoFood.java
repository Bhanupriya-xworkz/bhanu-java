package com.xworkz.Interface.internal;

    public class ZomatoFood implements FoodDelivery {

        private String currentOrder;

        @Override
        public void orderFood(String foodItem) {
            currentOrder = foodItem;
            System.out.println("Order placed on Zomato: " + foodItem);
        }

        @Override
        public void trackOrder() {
            System.out.println("Tracking your Zomato order: " + currentOrder + " - It’s on the way!");
        }

        @Override
        public void deliverOrder() {
            System.out.println("Your Zomato order '" + currentOrder + "' has been delivered. Enjoy your meal!");
            currentOrder = null;
        }
    }
    @Override
    public void deliveryTips() {
        System.out.println("Food Delivery Tip: Keep the food in a hot box to ensure it reaches the customer warm.");
    }


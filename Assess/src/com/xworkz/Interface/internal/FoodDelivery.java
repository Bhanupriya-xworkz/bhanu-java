package com.xworkz.Interface.internal;

    public interface FoodDelivery {
        void orderFood(String foodItem);
        void trackOrder();
        void deliverOrder();

        default void deliveryTips() {
            System.out.println("General Tip: Always check the delivery address before dispatching.");
        }
    }


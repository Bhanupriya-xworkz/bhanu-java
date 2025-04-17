package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.FoodDelivery;
import com.xworkz.Interface.internal.ZomatoFood;

public class FoodDeliveryMain {
        public static void main(String[] args) {
            FoodDelivery zomatoFood = new ZomatoFood();

            zomatoFood.orderFood("Paneer Butter Masala with Naan");
            zomatoFood.trackOrder();
            zomatoFood.deliverOrder();
            ZomatoFood.deliveryTips();
        }
    }


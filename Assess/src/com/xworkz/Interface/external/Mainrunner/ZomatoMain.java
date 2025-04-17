package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Restaurant;
import com.xworkz.Interface.internal.Zomato;

public class ZomatoMain {
        public static void main(String[] args) {

            Zomato zomato1 = new Restaurant();
            Zomato zomato2 = new Restaurant();
            Zomato zomato3 = new Restaurant();

            zomato1.viewMenu();
            zomato2.placeOrder();
            zomato3.trackOrder();

            Zomato.zomatoTips();
        }
    }


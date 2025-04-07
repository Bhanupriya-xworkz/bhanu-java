package com.xworkz.method.external;

import com.xworkz.method.internal.Drinks;
import com.xworkz.method.internal.SoftDrink;

public class DrinksRunner {
        public static void main(String[] args) {

            Drinks drink1 = new Drinks();
            drink1.pour();
            drink1.stir();
            drink1.taste();
            drink1.chill();
            drink1.drink();
            drink1.refill();

            System.out.println("=============");

            SoftDrink softDrink = new SoftDrink();
            softDrink.pour();
            softDrink.stir();
            softDrink.taste();
            softDrink.chill();
            softDrink.drink();
            softDrink.refill();

            System.out.println("=============");

            // Testing the Juice class
            Juice juice = new Juice();
            juice.pour();
            juice.stir();
            juice.taste();
            juice.chill();
            juice.drink();
            juice.refill();
        }
    }


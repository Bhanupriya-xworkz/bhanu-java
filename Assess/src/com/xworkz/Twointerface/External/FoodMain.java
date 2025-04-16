package com.xworkz.Twointerface.External;

import com.xworkz.Twointerface.Internal.Food;
import com.xworkz.Twointerface.Internal.Fruit;

public class FoodMain {
        public static void main(String[] args) {

            Food food1 = new Fruit();
            Food food2 = new Vegetable();

            food1.getName();
            food2.getType();

            Nutrition nutri1 = new Fruit();
            Nutrition nutri2 = new Vegetable();

            nutri1.getCalories();
            nutri2.getVitamins();
        }
    }


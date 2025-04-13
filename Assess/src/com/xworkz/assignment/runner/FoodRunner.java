package com.xworkz.assignment.runner;
import com.xworkz.inheretence.internal.Food;

public class FoodRunner {
        public static void main(String[] args) {
            Food f = new Food();
            System.out.println(f);
            System.out.println(new Food().hashCode());
            System.out.println("original hashCode:" + System.identityHashCode(f));

            Food food1 = new Food();
            food1.setName("Pizza");
            food1.setCalories(300);
            Food food2 = new Food();
            food2.setName("Burger");
            food2.setCalories(500);
            boolean same = food1.equals(food2);
            System.out.println("both same:" + same);
        }
    }


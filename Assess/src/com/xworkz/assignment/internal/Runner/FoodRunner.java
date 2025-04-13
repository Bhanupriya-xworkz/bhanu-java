package com.xworkz.assignment.internal.Runner;
import com.xworkz.inheretence.internal.Food;

public class FoodRunner {
        public static void main(String[] args) {
            Food f = new Food();
            System.out.println(f);
            System.out.println(new Food().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(f));

            Food food1 = new Food();
            food1.setVegetarian(true);
            Food food2 = new Food();
            food2.setVegetarian(false);
            boolean same = food1.equals(food2);
            System.out.println("both same: " + same);
        }
    }

package com.xworkz.Twointerface.Internal;

    public class Fruit implements Food, Nutrition {

        @Override
        public void getName() {
            System.out.println("Food: Apple");
        }

        @Override
        public void getType() {
            System.out.println("Type: Solid");
        }

        @Override
        public void getCalories() {
            System.out.println("Calories: 95");
        }

        @Override
        public void getVitamins() {
            System.out.println("Vitamins: A, C");
        }
    }

public class Vegetable implements Food, Nutrition {

    @Override
    public void getName() {
        System.out.println("Food: Spinach");
    }

    @Override
    public void getType() {
        System.out.println("Type: Leafy");
    }

    @Override
    public void getCalories() {
        System.out.println("Calories: 23 per 100g");
    }

    @Override
    public void getVitamins() {
        System.out.println("Vitamins: A, K, C");
    }
}


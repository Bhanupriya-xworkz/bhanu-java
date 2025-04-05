package com.xworkz.inheretence.internal;

    public class Friut extends Food {
        public void fruitInfo() {
            System.out.println("This is a fruit, a type of food that is typically sweet and grows on plants or trees.");
        }

        {
            super.foodTypes();
            System.out.println("Fruits are a subcategory of food that are usually sweet or sour and eaten raw.");
        }

        {
            super.nutritionalValue();
            System.out.println("Fruits are rich in vitamins, fiber, and antioxidants, making them beneficial for health.");
        }

        {
            super.foodPreparation();
            System.out.println("Fruits are typically eaten raw, but can also be used in cooking, smoothies, or desserts.");
        }

        {
            super.foodPreservation();
            System.out.println("Fruits can be preserved by freezing, canning, or making jams and juices.");
        }
    }


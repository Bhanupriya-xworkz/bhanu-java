package com.xworkz.inheretence.internal;

    public class GrilledChicken extends Chicken {
        public void grilledChickenInfo() {
            System.out.println("This is grilled chicken with a smoky flavor.");
        }

        {
            super.cookingMethod();
            System.out.println("Grilled chicken is cooked over direct heat, usually on a barbecue.");
        }

        {
            super.taste();
            System.out.println("Grilled chicken has a smoky and crispy texture.");
        }

        {
            super.serving();
            System.out.println("Grilled chicken is often served with grilled vegetables or sauces.");
        }

        {
            super.nutrition();
            System.out.println("Grilled chicken retains more nutrients and is lower in fat.");
        }
    }


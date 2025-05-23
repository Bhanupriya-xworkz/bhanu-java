package com.xworkz.Interface.internal;

    public class ItalianChef implements Chef {

        @Override
        public void prepareIngredients() {
            System.out.println("Preparing pasta, tomatoes, and herbs.");
        }

        @Override
        public void cookDish() {
            System.out.println("Cooking spaghetti bolognese.");
        }

        @Override
        public void serveDish() {
            System.out.println("Serving Italian cuisine with garlic bread.");
        }
    }
    @Override
    public void cookingTips() {
        System.out.println("Italian Chef Tip: Use fresh basil and olive oil for authentic flavor.");
    }


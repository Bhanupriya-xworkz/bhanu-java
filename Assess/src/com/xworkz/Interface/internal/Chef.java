package com.xworkz.Interface.internal;

    public interface Chef {
        void prepareIngredients();
        void cookDish();
        void serveDish();

        default void cookingTips() {
            System.out.println("General Tip: Always taste your food while cooking.");
        }
    }


package com.xworkz.Interface.internal;

    public interface RecipeManager {
        void addRecipe(String name, String ingredients);
        void viewRecipe();
        void markAsCooked();

        default void recipeTip() {
            System.out.println("General Tip: Always measure your ingredients properly for the best results.");
        }
    }


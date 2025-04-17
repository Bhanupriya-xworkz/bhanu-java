package com.xworkz.Interface.internal;

    public class MyRecipeBook implements RecipeManager {

        @Override
        public void addRecipe(String name, String ingredients) {
            System.out.println("✅ Recipe added");
        }

        @Override
        public void viewRecipe() {
                System.out.println("Ingredients");
            }

        @Override
        public void markAsCooked() {
                System.out.println("No recipe to mark as cooked.");
            }
        }

    @Override
    public void recipeTip() {
        System.out.println("Recipe Tip: Experiment with flavors to customize your recipes!");
    }


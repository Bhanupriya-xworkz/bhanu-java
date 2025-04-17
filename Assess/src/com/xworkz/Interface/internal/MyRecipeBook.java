package com.xworkz.Interface.internal;

    public class MyRecipeBook implements RecipeManager {

        private String recipeName;
        private String recipeIngredients;
        private boolean isCooked = false;

        @Override
        public void addRecipe(String name, String ingredients) {
            this.recipeName = name;
            this.recipeIngredients = ingredients;
            isCooked = false;
            System.out.println("✅ Recipe added: " + name);
        }

        @Override
        public void viewRecipe() {
            if (recipeName == null) {
                System.out.println("⚠️ No recipe found.");
            } else {
                System.out.println("📄 Recipe Details:");
                System.out.println("Name: " + recipeName);
                System.out.println("Ingredients: " + recipeIngredients);
                System.out.println("Status: " + (isCooked ? "Cooked" : "Not Cooked"));
            }
        }

        @Override
        public void markAsCooked() {
            if (recipeName != null) {
                isCooked = true;
                System.out.println("✅ You marked '" + recipeName + "' as cooked!");
            } else {
                System.out.println("⚠️ No recipe to mark as cooked.");
            }
        }
    }


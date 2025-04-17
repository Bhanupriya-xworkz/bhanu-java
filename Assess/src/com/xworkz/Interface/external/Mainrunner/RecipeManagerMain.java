package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.MyRecipeBook;
import com.xworkz.Interface.internal.RecipeManager;

public class RecipeManagerMain {
        public static void main(String[] args) {
            RecipeManager recipe = new MyRecipeBook();

            recipe.addRecipe("Pasta Alfredo", "Pasta, Cream, Garlic, Cheese");
            recipe.viewRecipe();
            recipe.markAsCooked();
            recipe.viewRecipe();
        }
    }


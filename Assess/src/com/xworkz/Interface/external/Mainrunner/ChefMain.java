package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Chef;
import com.xworkz.Interface.internal.ItalianChef;

public class ChefMain {
        public static void main(String[] args) {
            Chef italian = new ItalianChef();

            italian.prepareIngredients();
            italian.cookDish();
            italian.serveDish();
            italian.cookingTips();

        }
    }


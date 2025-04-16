package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Beer;
import com.xworkz.Interface.internal.CraftBeer;

public class BeerMain {
        public static void main(String[] args) {

            Beer beer1 = new CraftBeer();
            Beer beer2 = new CraftBeer();
            Beer beer3 = new CraftBeer();

            beer1.pour();
            beer2.drink();
            beer3.getAlcoholContent();
        }
    }


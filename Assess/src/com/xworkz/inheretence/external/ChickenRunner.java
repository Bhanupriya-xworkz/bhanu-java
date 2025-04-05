package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Chicken;
import com.xworkz.inheretence.internal.GrilledChicken;

public class ChickenRunner {
        public static void main(String[] args) {
            Chicken chicken = new GrilledChicken();
            chicken.cookingMethod();

            Chicken basicChicken = new Chicken();
        }
    }



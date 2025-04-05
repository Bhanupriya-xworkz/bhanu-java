package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Biriyani;
import com.xworkz.inheretence.internal.SpecialBiriyani;

public class BiriyaniRunner {
        public static void main(String[] args) {
            Biriyani biriyani = new SpecialBiriyani();  // Polymorphism: A SpecialBiriyani object is treated as a Biriyani
            biriyani.ingredients();  // Calls the overridden method from SpecialBiriyani

            Biriyani basicBiriyani = new Biriyani();  // Creating an object of the base class Biriyani
        }
    }


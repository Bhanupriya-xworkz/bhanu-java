package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.HeavyMetal;
import com.xworkz.inheretence.internal.Metal;

public class MetalRunner {
        public static void main(String[] args) {
            // Creating an object of HeavyMetal (which is a subclass of Metal)
            Metal metal = new HeavyMetal();
            Metal basicMetal = new Metal();

            // Using basic metal operations
            basicMetal.create();
            basicMetal.melt();
            basicMetal.forge();
            basicMetal.shape();

            // Using HeavyMetal operations
            HeavyMetal heavyMetal = new HeavyMetal();
            heavyMetal.useInConstruction();
            heavyMetal.useInTransportation();
            heavyMetal.create();
        }
    }

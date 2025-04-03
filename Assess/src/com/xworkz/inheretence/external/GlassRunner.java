package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Glass;
import com.xworkz.inheretence.internal.TemperedGlass;

public class GlassRunner {
        public static void main(String[] args) {
            // Creating an object of TemperedGlass (which is a subclass of Glass)
            Glass glass = new TemperedGlass();
            Glass basicGlass = new Glass();

            // Using basic glass operations
            basicGlass.melt();
            basicGlass.shape();
            basicGlass.cool();
            basicGlass.polish();

            // Using TemperedGlass operations
            TemperedGlass temperedGlass = new TemperedGlass();
            temperedGlass.increaseStrength();
            temperedGlass.useInConstruction();
            temperedGlass.melt();
        }
    }


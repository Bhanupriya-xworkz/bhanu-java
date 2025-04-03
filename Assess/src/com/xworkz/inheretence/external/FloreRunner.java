package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Flore;
import com.xworkz.inheretence.internal.TropicalFlore;

public class FloreRunner {
        public static void main(String[] args) {
            // Creating an object of TropicalFlore (which is a subclass of Flore)
            Flore flore = new TropicalFlore();
            Flore basicFlore = new Flore();

            // Using basic flore operations
            basicFlore.grow();
            basicFlore.bloom();
            basicFlore.wither();
            basicFlore.reproduce();

            // Using TropicalFlore operations
            TropicalFlore tropicalFlore = new TropicalFlore();
            tropicalFlore.waterNeeds();
            tropicalFlore.sunlightNeeds();
            tropicalFlore.grow();
        }
    }


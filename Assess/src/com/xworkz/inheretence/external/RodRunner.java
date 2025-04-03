package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.FishingRod;
import com.xworkz.inheretence.internal.Rod;

public class RodRunner {
        public static void main(String[] args) {
            // Creating an object of FishingRod (which is a subclass of Rod)
            Rod rod = new FishingRod();
            Rod basicRod = new Rod();

            // Using basic rod operations
            basicRod.bend();
            basicRod.straighten();
            basicRod.cut();
            basicRod.polish();

            // Using FishingRod operations
            FishingRod fishingRod = new FishingRod();
            fishingRod.castLine();
            fishingRod.reelIn();
            fishingRod.bend();
        }
    }

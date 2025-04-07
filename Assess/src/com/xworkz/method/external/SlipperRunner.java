package com.xworkz.method.external;

import com.xworkz.method.internal.Slipper;
import com.xworkz.method.internal.SportsSlipper;

    public class SlipperRunner {
        public static void main(String[] args) {
            // Testing the Slipper class
            Slipper slipper1 = new Slipper();
            slipper1.wear();
            slipper1.remove();
            slipper1.clean();
            slipper1.store();
            slipper1.repair();
            slipper1.slip();

            System.out.println("=============");

            // Testing the SportsSlipper class
            SportsSlipper sportsSlipper = new SportsSlipper();
            sportsSlipper.wear();
            sportsSlipper.remove();
            sportsSlipper.clean();
            sportsSlipper.store();
            sportsSlipper.repair();
            sportsSlipper.slip();
        }
    }


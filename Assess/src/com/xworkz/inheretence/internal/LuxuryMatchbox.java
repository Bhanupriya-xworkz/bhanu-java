package com.xworkz.inheretence.internal;

    public class LuxuryMatchbox extends Matchbox {
        public void luxuryInfo() {
            System.out.println("This is a luxury matchbox with premium materials and design.");
        }

        {
            super.material();
            System.out.println("Luxury matchboxes are made from high-quality wood or metal, with decorative designs.");
        }

        {
            super.safety();
            System.out.println("Luxury matchboxes often have advanced safety features, like waterproof coating.");
        }

        {
            super.lighting();
            System.out.println("Luxury matchboxes may have decorative strike surfaces for lighting the matches.");
        }

        {
            super.size();
            System.out.println("Luxury matchboxes come in custom sizes and elegant shapes.");
        }
    }


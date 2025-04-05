package com.xworkz.inheretence.internal;

    public class LuxuryBrand extends Brand {
        public void luxuryInfo() {
            System.out.println("This is a luxury brand with exclusive products.");
        }

        {
            super.marketPosition();
            System.out.println("The luxury brand is positioned in the premium market.");
        }

        {
            super.targetAudience();
            System.out.println("The luxury brand targets high-net-worth individuals.");
        }

        {
            super.productLine();
            System.out.println("The luxury brand offers limited and exclusive products.");
        }

        {
            super.advertising();
            System.out.println("The luxury brand uses high-end advertising methods.");
        }
    }


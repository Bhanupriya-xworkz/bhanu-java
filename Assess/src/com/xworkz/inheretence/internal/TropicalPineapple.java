package com.xworkz.inheretence.internal;

    public class TropicalPineapple extends Pineapple {

        public TropicalPineapple() {
            super();
            System.out.println("TropicalPineapple constructor");
        }

        public void checkRipeness() {
            super.checkRipeness();
            System.out.println("Checking the ripeness of the Tropical Pineapple...");
        }

        public void checkSweetness() {
            super.checkSweetness();
            System.out.println("Checking the sweetness of the Tropical Pineapple...");
        }

        public void checkSize() {
            super.checkSize();
            System.out.println("Checking the size of the Tropical Pineapple...");
        }

        public void peelPineapple() {
            super.peelPineapple();
            System.out.println("Peeling the Tropical Pineapple...");
        }

        public void cutPineapple() {
            super.cutPineapple();
            System.out.println("Cutting the Tropical Pineapple...");
        }
    }


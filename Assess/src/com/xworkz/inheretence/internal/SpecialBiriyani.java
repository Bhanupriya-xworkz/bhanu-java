package com.xworkz.inheretence.internal;

    public class SpecialBiriyani extends Biriyani {
        public void specialInfo() {
            System.out.println("This is a special biriyani with premium ingredients.");
        }

        {
            super.ingredients();
            System.out.println("Special biriyani contains saffron, dry fruits, and premium spices.");
        }

        {
            super.cookingMethod();
            System.out.println("Special biriyani is cooked with a dum method, sealed tightly for flavor.");
        }

        {
            super.taste();
            System.out.println("Special biriyani tastes rich, aromatic, and indulgent.");
        }

        {
            super.serving();
            System.out.println("Special biriyani is served with a special gravy or kurma.");
        }
    }


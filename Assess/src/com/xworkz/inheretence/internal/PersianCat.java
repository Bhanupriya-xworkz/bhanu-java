package com.xworkz.inheretence.internal;

    public class PersianCat extends Cat {
        public void persianInfo() {
            System.out.println("This is a Persian cat, known for its long fur and flat face.");
        }

        {
            super.sound();
            System.out.println("A Persian cat meows softly and has a gentle voice.");
        }

        {
            super.movement();
            System.out.println("A Persian cat is calm and moves slowly.");
        }

        {
            super.diet();
            System.out.println("A Persian cat requires a special diet to maintain its coat.");
        }

        {
            super.grooming();
            System.out.println("A Persian cat needs regular grooming due to its long fur.");
        }
    }

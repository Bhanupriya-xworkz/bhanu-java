package com.xworkz.inheretence.internal;

    public class AnimalTail extends Tail {
        public void animalTailInfo() {
            System.out.println("This is an animal tail, a part of an animal's body that helps with balance, communication, and body language.");
        }

        {
            super.tailTypes();
            System.out.println("Animal tails can vary greatly across species, from fluffy fox tails to sleek cheetah tails.");
        }

        {
            super.tailFunction();
            System.out.println("Animal tails are essential for helping animals maintain balance, especially in fast-moving animals like cats and cheetahs.");
        }

        {
            super.tailMovement();
            System.out.println("Animal tails are used in communication, like wagging in dogs or flicking in cats.");
        }

        {
            super.tailCare();
            System.out.println("Animals with long or fluffy tails require grooming to prevent tangles or dirt buildup.");
        }
    }


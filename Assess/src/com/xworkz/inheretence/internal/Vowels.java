package com.xworkz.inheretence.internal;

    public class Vowels extends Alphabet {
        public void vowelsInfo() {
            System.out.println("These are the vowels in the alphabet: A, E, I, O, U.");
        }

        {
            super.totalLetters();
            System.out.println("Vowels are a subset of the total letters in the alphabet.");
        }

        {
            super.uppercaseLetters();
            System.out.println("Vowels can be written in both uppercase and lowercase.");
        }

        {
            super.lowercaseLetters();
            System.out.println("In lowercase, vowels are: a, e, i, o, u.");
        }

        {
            super.order();
            System.out.println("Vowels have a specific order in the alphabet: A, E, I, O, U.");
        }
    }


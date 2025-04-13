package com.xworkz.assignment.internal.veriable3;

    public class Alphabets {
        private char letter;
        private int position;

        public Alphabets() {
            System.out.println("Running non-arg constructor Alphabets");
            System.out.println("letter: " + this.letter);
            this.letter = 'A';
            this.position = 1;
        }

        @Override
        public String toString() {
            return "Letter: " + letter + ", Position: " + position;
        }

        @Override
        public int hashCode() {
            System.out.println("AlphabetsHashCode: " + super.hashCode());
            return 5678;  // Arbitrary hash code
        }


        public void setLetter(char letter) {
            this.letter = letter;
            this.position = letter - 'A' + 1;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                Alphabets alphabet1 = this;
                Alphabets alphabet2 = (Alphabets) obj;
                if (obj instanceof Alphabets) {
                    System.out.println("Have reference, will compare...");
                    if (alphabet1.letter == alphabet2.letter && alphabet1.position == alphabet2.position) {
                        System.out.println("Both are the same");
                        return true;
                    }
                }
            }
            return false;
        }
    }


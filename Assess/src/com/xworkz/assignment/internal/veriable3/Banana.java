package com.xworkz.assignment.internal.veriable3;

    public class Banana {
        private int length;
        private String ripeness;
        private boolean isOrganic;

        // Constructor
        public Banana() {
            System.out.println("running non-arg constructor Banana");
            System.out.println("length: " + this.length);
            this.length = 0;
            this.ripeness = "Unripe";
            this.isOrganic = true;
        }

        @Override
        public String toString() {
            return "Length: " + length + " cm, Ripeness: " + ripeness + ", Organic: " + isOrganic;
        }

        @Override
        public int hashCode() {
            System.out.println("BananaHashCode: " + super.hashCode());
            return 2022; // Arbitrary hash code
        }

        public void setLength(int length) {
            this.length = length;
        }

        public void setRipeness(String ripeness) {
            this.ripeness = ripeness;
        }

        public void setIsOrganic(boolean isOrganic) {
            this.isOrganic = isOrganic;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                Banana banana1 = this;
                Banana banana2 = (Banana) obj;
                if (obj instanceof Banana) {
                    System.out.println("have ref. will compare..");
                    if (banana1.isOrganic == banana2.isOrganic) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }


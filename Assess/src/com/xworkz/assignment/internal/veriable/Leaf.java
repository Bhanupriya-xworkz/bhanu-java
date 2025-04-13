package com.xworkz.assignment.internal.veriable;

    public class Leaf {
        private String species;
        private double length;
        private boolean isGreen;

        public Leaf() {
            System.out.println("Running no-arg constructor of Leaf");
            this.species = "Maple";
            this.length = 10.0;
            this.isGreen = true;
        }

        @Override
        public String toString() {
            return "Species: " + species + ", Length: " + length + " cm, Is Green: " + isGreen;
        }

        @Override
        public int hashCode() {
            System.out.println("LeafHashCode" + super.hashCode());
            return 400;
        }

        public void setSpecies(String species) {
            this.species = species;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public void setGreen(boolean isGreen) {
            this.isGreen = isGreen;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Leaf) {
                    System.out.println("have ref. will compare..");
                    Leaf leaf1 = this;
                    Leaf leaf2 = (Leaf) obj;
                    if (leaf1.species.equals(leaf2.species) && leaf1.length == leaf2.length) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }


package com.xworkz.assignment.internal.veriable;

    public class Flore {
        private String species;
        private String color;
        private boolean isBlooming;

        public Flore() {
            System.out.println("Running no-arg constructor of Flore");
            this.species = "Rose";
            this.color = "Red";
            this.isBlooming = true;
        }

        @Override
        public String toString() {
            return "Species: " + species + ", Color: " + color + ", Is Blooming: " + isBlooming;
        }

        @Override
        public int hashCode() {
            System.out.println("FloreHashCode" + super.hashCode());
            return 380;
        }

        public void setSpecies(String species) {
            this.species = species;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setBlooming(boolean isBlooming) {
            this.isBlooming = isBlooming;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Flore) {
                    System.out.println("have ref. will compare..");
                    Flore flore1 = this;
                    Flore flore2 = (Flore) obj;
                    if (flore1.species.equals(flore2.species) && flore1.color.equals(flore2.color)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }


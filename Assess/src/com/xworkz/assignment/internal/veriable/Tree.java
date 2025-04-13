package com.xworkz.assignment.internal.veriable;

    public class Tree {
        private String species;
        private double height;
        private boolean isEvergreen;

        public Tree() {
            System.out.println("Running no-arg constructor of Tree");
            this.species = "Oak";
            this.height = 10.0;
            this.isEvergreen = false;
        }

        @Override
        public String toString() {
            return "Species: " + species + ", Height: " + height + " meters, Is Evergreen: " + isEvergreen;
        }

        @Override
        public int hashCode() {
            System.out.println("TreeHashCode" + super.hashCode());
            return 390;
        }

        public void setSpecies(String species) {
            this.species = species;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public void setEvergreen(boolean isEvergreen) {
            this.isEvergreen = isEvergreen;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Tree) {
                    System.out.println("have ref. will compare..");
                    Tree tree1 = this;
                    Tree tree2 = (Tree) obj;
                    if (tree1.species.equals(tree2.species) && tree1.height == tree2.height) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }


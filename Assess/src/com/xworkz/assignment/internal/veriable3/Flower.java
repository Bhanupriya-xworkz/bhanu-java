package com.xworkz.assignment.internal.veriable3;

    public class Flower {
        private String name;
        private double height;
        private boolean isBlooming;

        public Flower() {
            System.out.println("Running non-arg constructor Flower");
            System.out.println("name: " + this.name);
            this.name = "Rose";
            this.height = 30.0;
            this.isBlooming = true;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Height: " + height + " cm, Is Blooming: " + isBlooming;
        }

        @Override
        public int hashCode() {
            System.out.println("FlowerHashCode: " + super.hashCode());
            return 2021; // Arbitrary hash code
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public void setBlooming(boolean isBlooming) {
            this.isBlooming = isBlooming;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                Flower flower1 = this;
                Flower flower2 = (Flower) obj;
                if (obj instanceof Flower) {
                    System.out.println("have ref. will compare..");
                    if (flower1.name.equals(flower2.name) && flower1.height == flower2.height && flower1.isBlooming == flower2.isBlooming) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }


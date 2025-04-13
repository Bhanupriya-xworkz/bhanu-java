package com.xworkz.assignment.internal.veriable;

    public class Cat {
        private String breed;
        private String color;
        private boolean isDomestic;

        public Cat() {
            System.out.println("Running no-arg constructor of Cat");
            this.breed = "Persian";
            this.color = "White";
            this.isDomestic = true;
        }

        @Override
        public String toString() {
            return "Breed: " + breed + ", Color: " + color + ", Is Domestic: " + isDomestic;
        }

        @Override
        public int hashCode() {
            System.out.println("CatHashCode" + super.hashCode());
            return 105;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Cat) {
                    System.out.println("have ref. will compare..");
                    Cat cat1 = this;
                    Cat cat2 = (Cat) obj;
                    if (cat1.breed.equals(cat2.breed)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }


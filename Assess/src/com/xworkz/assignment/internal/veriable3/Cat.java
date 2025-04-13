package com.xworkz.assignment.internal.veriable3;

    public class Cat {
        private String breed;
        private int age;
        private boolean isDomesticated;

        // Constructor
        public Cat() {
            System.out.println("running non-arg constructor Cat");
            System.out.println("breed: " + this.breed);
            this.breed = "Persian";
            this.age = 2;
            this.isDomesticated = true;
        }

        @Override
        public String toString() {
            return "Breed: " + breed + ", Age: " + age + " years, Domesticated: " + isDomesticated;
        }

        @Override
        public int hashCode() {
            System.out.println("CatHashCode: " + super.hashCode());
            return 5050; // Arbitrary hash code
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setDomesticated(boolean isDomesticated) {
            this.isDomesticated = isDomesticated;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                Cat cat1 = this;
                Cat cat2 = (Cat) obj;
                if (obj instanceof Cat) {
                    System.out.println("have ref. will compare..");
                    if (cat1.breed.equals(cat2.breed) && cat1.age == cat2.age && cat1.isDomesticated == cat2.isDomesticated) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }


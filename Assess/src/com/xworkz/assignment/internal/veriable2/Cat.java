package com.xworkz.assignment.internal.veriable2;

public class Cat {
        private String breed;
        private int age; // in years
        private boolean isDomestic;

        public Cat(String breed, int age, boolean isDomestic) {
            this.breed = breed;
            this.age = age;
            this.isDomestic = isDomestic;
        }

        @Override
        public String toString() {
            return "Cat{breed=" + breed + ", age=" + age + " years, isDomestic=" + isDomestic + "}";
        }

        @Override
        public int hashCode() {
            System.out.println("CatHashCode:" + super.hashCode());
            return 8751;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setIsDomestic(boolean isDomestic) {
            this.isDomestic = isDomestic;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Cat) {
                    System.out.println("have ref. will compare..");
                    Cat cat1 = this;
                    Cat cat2 = (Cat) obj;
                    if (cat1.breed.equals(cat2.breed) && cat1.age == cat2.age && cat1.isDomestic == cat2.isDomestic) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }


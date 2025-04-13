package com.xworkz.assignment.internal.veriable;

    public class Food {
        private String name;
        private String cuisine;
        private boolean isVegetarian;

        public Food() {
            System.out.println("Running no-arg constructor of Food");
            this.name = "Pasta";
            this.cuisine = "Italian";
            this.isVegetarian = true;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Cuisine: " + cuisine + ", Is Vegetarian: " + isVegetarian;
        }

        @Override
        public int hashCode() {
            System.out.println("FoodHashCode" + super.hashCode());
            return 170;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Food) {
                    System.out.println("have ref. will compare..");
                    Food food1 = this;
                    Food food2 = (Food) obj;
                    if (food1.name.equals(food2.name)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }


package com.xworkz.assignment.internal.veriable3;

    public class Food {
        private String name;
        private double price;
        private String type;

        public Food() {
            System.out.println("Running non-arg constructor Food");
            System.out.println("name: " + this.name);
            this.name = "Pizza";
            this.price = 10.0;
            this.type = "Fast Food";
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Price: " + price + ", Type: " + type;
        }

        @Override
        public int hashCode() {
            System.out.println("FoodHashCode: " + super.hashCode());
            return 1234;  // Arbitrary hash code
        }


        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                Food food1 = this;
                Food food2 = (Food) obj;
                if (obj instanceof Food) {
                    System.out.println("have ref. will compare..");
                    if (food1.name.equals(food2.name) && food1.price == food2.price && food1.type.equals(food2.type)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }


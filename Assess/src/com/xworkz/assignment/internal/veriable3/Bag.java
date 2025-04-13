package com.xworkz.assignment.internal.veriable3;

    public class Bag {
        private String brand;
        private String color;
        private double price;

        public Bag() {
            System.out.println("Running non-arg constructor Bag");
            System.out.println("brand: " + this.brand);
            this.brand = "Generic";
            this.color = "Black";
            this.price = 49.99;
        }

        @Override
        public String toString() {
            return "Brand: " + brand + ", Color: " + color + ", Price: $" + price;
        }

        @Override
        public int hashCode() {
            System.out.println("BagHashCode: " + super.hashCode());
            return 1234;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof Bag) {
                    System.out.println("Have reference. Will compare...");
                    Bag b1 = this;
                    Bag b2 = (Bag) obj;
                    if (b1.brand.equals(b2.brand) &&
                            b1.color.equals(b2.color) &&
                            b1.price == b2.price) {
                        System.out.println("Both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }


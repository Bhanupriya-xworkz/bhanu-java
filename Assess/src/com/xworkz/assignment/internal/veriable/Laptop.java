package com.xworkz.assignment.internal.veriable;

    public class Laptop {
        private String brand;
        private String model;
        private boolean isTouchScreen;

        public Laptop() {
            System.out.println("Running no-arg constructor of Laptop");
            this.brand = "HP";
            this.model = "Pavilion 15";
            this.isTouchScreen = true;
        }

        @Override
        public String toString() {
            return "Brand: " + brand + ", Model: " + model + ", Is Touch Screen: " + isTouchScreen;
        }

        @Override
        public int hashCode() {
            System.out.println("LaptopHashCode" + super.hashCode());
            return 120;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Laptop) {
                    System.out.println("have ref. will compare..");
                    Laptop laptop1 = this;
                    Laptop laptop2 = (Laptop) obj;
                    if (laptop1.model.equals(laptop2.model)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }


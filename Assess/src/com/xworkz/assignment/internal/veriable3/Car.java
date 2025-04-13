package com.xworkz.assignment.internal.veriable3;

    public class Car {
        private String model;
        private String brand;
        private int year;

        public Car() {
            System.out.println("running non-arg constructor Car");
            System.out.println("model: " + this.model);
            this.model = "Sedan";
            this.brand = "Toyota";
            this.year = 2020;
        }

        @Override
        public String toString() {
            return "Model: " + model + ", Brand: " + brand + ", Year: " + year;
        }

        @Override
        public int hashCode() {
            System.out.println("CarHashCode: " + super.hashCode());
            return 12345;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                Car car1 = this;
                Car car2 = (Car) obj;
                if (obj instanceof Car) {
                    System.out.println("have ref. will compare..");
                    if (car1.model.equals(car2.model) && car1.brand.equals(car2.brand) && car1.year == car2.year) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }


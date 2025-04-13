package com.xworkz.assignment.internal.veriable2;

    public class Laptop {
        private String brand;
        private double price;
        private String processor;
        private boolean isTouchscreen;

        public Laptop(String brand, double price, String processor, boolean isTouchscreen) {
            this.brand = brand;
            this.price = price;
            this.processor = processor;
            this.isTouchscreen = isTouchscreen;
        }

        @Override
        public String toString() {
            return "Laptop{brand='" + brand + "', price=" + price + ", processor='" + processor + "', isTouchscreen=" + isTouchscreen + "}";
        }

        @Override
        public int hashCode() {
            System.out.println("LaptopHashCode: " + super.hashCode());
            return 1234;  // An arbitrary hash code value for demonstration
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setProcessor(String processor) {
            this.processor = processor;
        }

        public void setIsTouchscreen(boolean isTouchscreen) {
            this.isTouchscreen = isTouchscreen;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof Laptop) {
                    System.out.println("Comparing references...");
                    Laptop laptop1 = this;
                    Laptop laptop2 = (Laptop) obj;
                    if (laptop1.brand.equals(laptop2.brand) && laptop1.price == laptop2.price && laptop1.processor.equals(laptop2.processor) && laptop1.isTouchscreen == laptop2.isTouchscreen) {
                        System.out.println("Both are the same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

